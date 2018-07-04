package matteocrippa.it.karamba

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.text.TextUtils
import android.util.Base64
import android.webkit.URLUtil
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Random

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun String.isValidEmail(): Boolean {
    return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isUrl(): Boolean {
    return URLUtil.isValidUrl(this)
}

fun String.isNumeric(): Boolean {
    try {
        val d = java.lang.Double.parseDouble(this)
    } catch (nfe: NumberFormatException) {
        return false
    }

    return true
}

fun String.isPhoneNumber(): Boolean {
    return android.util.Patterns.PHONE.matcher(this).matches()
}

fun String.random(length: Int = 8): String {
    val random = Random()
    val base = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+"
    var randomString: String = ""

    for (i in 1..length) {
        val randomValue = (0..base.count()).random()
        randomString += "${base[randomValue]}"
    }
    return randomString
}

fun String.toBitmap(maxWidth: Int = 800, maxHeight: Int = 800): Bitmap {
    val decoded = Base64.decode(this, Base64.DEFAULT)

    // First decode with inJustDecodeBounds=true to check dimensions
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    BitmapFactory.decodeByteArray(decoded, 0, decoded.count(), options)

    // Calculate inSampleSize
    options.inSampleSize = calculateInSampleSize(options, maxWidth, maxHeight)

    // Decode bitmap with inSampleSize set
    options.inJustDecodeBounds = false
    return BitmapFactory.decodeByteArray(decoded, 0, decoded.count(), options)
}

fun String.ellipsize(at: Int): String {
    if (this.length > at) {
        return this.substring(0, at) + "..."
    }
    return this
}

fun String.toDate(withFormat: String = "yyyy/MM/dd hh:mm"): Date {
    val dateFormat = SimpleDateFormat(withFormat)
    var convertedDate = Date()
    try {
        convertedDate = dateFormat.parse(this)
    } catch (e: ParseException) {
        // TODO Auto-generated catch block
        e.printStackTrace()
    }

    return convertedDate
}

fun String.plainText(): String {
    return android.text.Html.fromHtml(this).toString()
}

fun String.toCamelCase(): String {
    if (this == null || TextUtils.isEmpty(this))
        return ""
    return Character.toUpperCase(this[0]) +
            this.substring(1).toLowerCase()
}

fun calculateInSampleSize(
    options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
    // Raw height and width of image
    val height = options.outHeight
    val width = options.outWidth
    var inSampleSize = 1

    if (height > reqHeight || width > reqWidth) {

        val halfHeight = height / 2
        val halfWidth = width / 2

        // Calculate the largest inSampleSize value that is a power of 2 and keeps both
        // height and width larger than the requested height and width.
        while (halfHeight / inSampleSize >= reqHeight && halfWidth / inSampleSize >= reqWidth) {
            inSampleSize *= 2
        }
    }

    return inSampleSize
}
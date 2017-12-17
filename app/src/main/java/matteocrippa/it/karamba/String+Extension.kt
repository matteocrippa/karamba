package matteocrippa.it.karamba

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.text.TextUtils
import android.util.Base64
import android.webkit.URLUtil
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun String.isValidEmail(): Boolean {
    return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isUrl(): Boolean {
    return URLUtil.isValidUrl(this)
}

fun String.toBitmap(): Bitmap {
    val decoded = Base64.decode(this, Base64.DEFAULT)
    return BitmapFactory.decodeByteArray(decoded, 0, decoded.count())
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
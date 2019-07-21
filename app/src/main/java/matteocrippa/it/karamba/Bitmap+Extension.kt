package matteocrippa.it.karamba

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.util.Base64
import java.io.ByteArrayOutputStream

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun Bitmap.base64(): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
    val byteArray = byteArrayOutputStream.toByteArray()
    return Base64.encodeToString(byteArray, Base64.DEFAULT)
}

fun Bitmap.resize(newWidth: Int, newHeight: Int): Bitmap {
    val scaleWidth = newWidth.toFloat() / width
    val scaleHeight = newHeight.toFloat() / height
    val matrix = Matrix()
    matrix.postScale(scaleWidth, scaleHeight)
    val resizedBitmap = Bitmap.createBitmap(
            this, 0, 0, width, height, matrix, false)
    this.recycle()
    return resizedBitmap
}

/**
 * Overlay a bitmap over another one.
 *
 * @param overlay The overlay bitmap.
 * @return A bitmap which contains the overlay over the original bitmap.
 */
fun Bitmap.overlay(overlay: Bitmap): Bitmap {
    val result = Bitmap.createBitmap(width, height, config)
    val canvas = Canvas(result)
    canvas.drawBitmap(this, Matrix(), null)
    canvas.drawBitmap(overlay, Matrix(), null)
    return result
}

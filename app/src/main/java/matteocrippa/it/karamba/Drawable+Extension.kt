package matteocrippa.it.karamba

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun Drawable.toBitmap(): Bitmap {
    var bitmap: Bitmap?

    if (this is BitmapDrawable) {
        val bitmapDrawable = this as BitmapDrawable
        if (bitmapDrawable.bitmap != null) {
            return bitmapDrawable.bitmap
        }
    }

    if (this.intrinsicWidth <= 0 || this.intrinsicHeight <= 0) {
        bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) // Single color bitmap will be created of 1x1 pixel
    } else {
        bitmap = Bitmap.createBitmap(this.intrinsicWidth, this.intrinsicHeight, Bitmap.Config.ARGB_8888)
    }

    val canvas = Canvas(bitmap)
    this.bounds.set(0, 0, canvas.width, canvas.height)
    this.draw(canvas)
    return bitmap
}
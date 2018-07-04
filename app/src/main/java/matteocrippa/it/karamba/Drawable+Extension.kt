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
        if (this.bitmap != null) {
            return this.bitmap
        }
    }

    bitmap = if (this.intrinsicWidth <= 0 || this.intrinsicHeight <= 0) {
        Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444) // Single color bitmap will be created of 1x1 pixel
    } else {
        Bitmap.createBitmap(this.intrinsicWidth, this.intrinsicHeight, Bitmap.Config.ARGB_4444)
    }

    val canvas = Canvas(bitmap)
    this.bounds.set(0, 0, canvas.width, canvas.height)
    this.draw(canvas)
    return bitmap
}
package matteocrippa.it.karamba

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by matteocrippa on 17/12/2017.
 */

// Converts current date to proper provided format
fun Date.convertTo(format: String): String? {
    var dateStr: String? = null
    val df = SimpleDateFormat(format)
    try {
        dateStr = df.format(this)
    } catch (ex: Exception) {
        Log.d("date", ex.toString())
    }

    return dateStr
}

// Converts current date to Calendar
fun Date.toCalendar(): Calendar {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal
}

fun Date.isFuture(): Boolean {
    return !Date().before(this)
}

fun Date.isPast(): Boolean {
    return Date().before(this)
}
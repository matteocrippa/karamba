package matteocrippa.it.karamba

import android.text.format.DateUtils
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

fun Date.isToday(): Boolean {
    return DateUtils.isToday(this.time)
}

fun Date.isYesterday(): Boolean {
    return DateUtils.isToday(this.time + DateUtils.DAY_IN_MILLIS)
}

fun Date.isTomorrow(): Boolean {
    return DateUtils.isToday(this.time - DateUtils.DAY_IN_MILLIS)
}

fun Date.today(): Date {
    return Date()
}

fun Date.yesterday(): Date {
    val cal = this.toCalendar()
    cal.add(Calendar.DAY_OF_YEAR, -1)
    return cal.time
}

fun Date.tomorrow(): Date {
    val cal = this.toCalendar()
    cal.add(Calendar.DAY_OF_YEAR, 1)
    return cal.time
}

fun Date.hour(): Int {
    return this.toCalendar().get(Calendar.HOUR)
}

fun Date.minute(): Int {
    return this.toCalendar().get(Calendar.MINUTE)
}

fun Date.second(): Int {
    return this.toCalendar().get(Calendar.SECOND)
}

fun Date.month(): Int {
    return this.toCalendar().get(Calendar.MONTH) + 1
}

fun Date.monthName(locale: Locale? = Locale.getDefault()): String {
    return this.toCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, locale)
}

fun Date.year(): Int {
    return this.toCalendar().get(Calendar.YEAR)
}

fun Date.day(): Int {
    return this.toCalendar().get(Calendar.DAY_OF_MONTH)
}

fun Date.dayOfWeek(): Int {
    return this.toCalendar().get(Calendar.DAY_OF_WEEK)
}

fun Date.dayOfWeekName(locale: Locale? = Locale.getDefault()): String {
    return this.toCalendar().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale)
}

fun Date.dayOfYear(): Int {
    return this.toCalendar().get(Calendar.DAY_OF_YEAR)
}
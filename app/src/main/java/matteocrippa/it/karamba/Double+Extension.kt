package matteocrippa.it.karamba

import java.text.NumberFormat
import java.util.*

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun Double.localCurrency(locale: String): String {
    val format = NumberFormat.getCurrencyInstance(Locale.getDefault())
    format.currency = Currency.getInstance(locale)
    return format.format(this)
}
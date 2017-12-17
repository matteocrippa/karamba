package matteocrippa.it.karamba

import java.util.*

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun Int.readableDistanceFromMeters(): String {
    return if (this < 1000) {
        "${this}m"
    } else {
        "${this / 1000}km"
    }
}

fun ArrayList<Int>.commaSeparatedId(): String? {
    return this.fold("") { acc, num ->
        acc + "$num, "
    }
}

fun ClosedRange<Int>.random() =
        Random().nextInt(endInclusive - start) +  start
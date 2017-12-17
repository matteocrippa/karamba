package matteocrippa.it.karamba

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
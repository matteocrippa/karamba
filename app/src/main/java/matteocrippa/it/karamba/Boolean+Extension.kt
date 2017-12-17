package matteocrippa.it.karamba

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun Boolean.toggle(): Boolean {
    return !this
}

fun Boolean.random(): Boolean {
    return (0..1).random() as Boolean
}
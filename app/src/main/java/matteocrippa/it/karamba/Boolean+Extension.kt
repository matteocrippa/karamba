package matteocrippa.it.karamba

/**
 * Created by matteocrippa on 17/12/2017.
 */

fun Boolean.toggle(): Boolean {
    !this
}

fun Boolean.random() {
    (0..1).random() as Boolean
}
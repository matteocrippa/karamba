package matteocrippa.it.karamba

import android.os.Build

/**
 * Created by matteocrippa on 15/01/2018.
 */

inline fun support(version: Int, code: () -> Unit) {
    if(Build.VERSION.SDK_INT > version) {
        code.invoke()
    }
}

inline fun supportKitkat(code: () -> Unit) {
    support(18) {
        code.invoke()
    }
}

inline fun supportLollipop(code: () -> Unit) {
    support(21) {
        code.invoke()
    }
}
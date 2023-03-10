

package net.github.dn12.dnaweather.util

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import net.github.dn12.dnaweather.R

fun View.visible() {
    visibility = View.VISIBLE
}
fun View.gone() {
    visibility = View.GONE
}

fun View.enable() {
    isEnabled = true
}

fun View.disable() {
    isEnabled = false
}

fun ConstraintLayout.changeTopCitiesTextViewConstraints(resId: Int) {
    val constraintSet = ConstraintSet()
    constraintSet.clone(this)
    constraintSet.connect(R.id.topCitiesTextView, ConstraintSet.TOP, resId, ConstraintSet.BOTTOM)
    constraintSet.applyTo(this)
}
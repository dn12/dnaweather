

package net.github.dn12.storage.extensions

import java.text.SimpleDateFormat
import java.util.*

private const val KELVIN: Double = 273.15

fun Double.asCelsius(): Double =
    this - KELVIN

fun Long.asSunrisePST(): String {
    val date = Date(this * 1000L)
    val calendar = Calendar.getInstance()
    calendar.time = date
    return "${calendar[Calendar.HOUR_OF_DAY]}:${calendar[Calendar.MINUTE]}"
}

fun Long.asDate():String{
    val output = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.US)
    try {
        return output.format(this)    // format output
    } catch (e: Exception) {
        e.printStackTrace()
        return this.toString()
    }
}
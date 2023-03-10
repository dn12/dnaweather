// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package net.github.dn12.network.api.response

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

public class MainJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Main>() {
  private val options: JsonReader.Options = JsonReader.Options.of("temp", "feels_like", "temp_min",
      "temp_max")

  private val doubleAdapter: JsonAdapter<Double> = moshi.adapter(Double::class.java, emptySet(),
      "temp")

  @Volatile
  private var constructorRef: Constructor<Main>? = null

  public override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("Main").append(')') }

  public override fun fromJson(reader: JsonReader): Main {
    var temp: Double? = 0.0
    var feelsLike: Double? = 0.0
    var tempMin: Double? = 0.0
    var tempMax: Double? = 0.0
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          temp = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("temp", "temp", reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          feelsLike = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("feelsLike",
              "feels_like", reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          tempMin = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("tempMin",
              "temp_min", reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          tempMax = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("tempMax",
              "temp_max", reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffffff0.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Main(
          temp = temp as Double,
          feelsLike = feelsLike as Double,
          tempMin = tempMin as Double,
          tempMax = tempMax as Double
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Main> = this.constructorRef ?:
          Main::class.java.getDeclaredConstructor(Double::class.javaPrimitiveType,
          Double::class.javaPrimitiveType, Double::class.javaPrimitiveType,
          Double::class.javaPrimitiveType, Int::class.javaPrimitiveType,
          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
      return localConstructor.newInstance(
          temp,
          feelsLike,
          tempMin,
          tempMax,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Main?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("temp")
    doubleAdapter.toJson(writer, value_.temp)
    writer.name("feels_like")
    doubleAdapter.toJson(writer, value_.feelsLike)
    writer.name("temp_min")
    doubleAdapter.toJson(writer, value_.tempMin)
    writer.name("temp_max")
    doubleAdapter.toJson(writer, value_.tempMax)
    writer.endObject()
  }
}

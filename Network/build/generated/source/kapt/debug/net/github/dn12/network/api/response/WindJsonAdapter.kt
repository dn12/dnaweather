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

public class WindJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Wind>() {
  private val options: JsonReader.Options = JsonReader.Options.of("speed")

  private val doubleAdapter: JsonAdapter<Double> = moshi.adapter(Double::class.java, emptySet(),
      "speed")

  @Volatile
  private var constructorRef: Constructor<Wind>? = null

  public override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("Wind").append(')') }

  public override fun fromJson(reader: JsonReader): Wind {
    var speed: Double? = 0.0
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          speed = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("speed", "speed",
              reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffffffe.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Wind(
          speed = speed as Double
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Wind> = this.constructorRef ?:
          Wind::class.java.getDeclaredConstructor(Double::class.javaPrimitiveType,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          speed,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Wind?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("speed")
    doubleAdapter.toJson(writer, value_.speed)
    writer.endObject()
  }
}
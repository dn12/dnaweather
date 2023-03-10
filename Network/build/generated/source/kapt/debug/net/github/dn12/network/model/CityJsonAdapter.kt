// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package net.github.dn12.network.model

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

public class CityJsonAdapter(
  moshi: Moshi
) : JsonAdapter<City>() {
  private val options: JsonReader.Options = JsonReader.Options.of("country", "lat", "lon", "name",
      "state")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "country")

  private val nullableDoubleAdapter: JsonAdapter<Double?> =
      moshi.adapter(Double::class.javaObjectType, emptySet(), "lat")

  @Volatile
  private var constructorRef: Constructor<City>? = null

  public override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("City").append(')') }

  public override fun fromJson(reader: JsonReader): City {
    var country: String? = null
    var lat: Double? = null
    var lon: Double? = null
    var name: String? = null
    var state: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          country = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          lat = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          lon = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          name = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          state = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xffffffe0.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  City(
          country = country,
          lat = lat,
          lon = lon,
          name = name,
          state = state
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<City> = this.constructorRef ?:
          City::class.java.getDeclaredConstructor(String::class.java, Double::class.javaObjectType,
          Double::class.javaObjectType, String::class.java, String::class.java,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          country,
          lat,
          lon,
          name,
          state,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: City?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("country")
    nullableStringAdapter.toJson(writer, value_.country)
    writer.name("lat")
    nullableDoubleAdapter.toJson(writer, value_.lat)
    writer.name("lon")
    nullableDoubleAdapter.toJson(writer, value_.lon)
    writer.name("name")
    nullableStringAdapter.toJson(writer, value_.name)
    writer.name("state")
    nullableStringAdapter.toJson(writer, value_.state)
    writer.endObject()
  }
}

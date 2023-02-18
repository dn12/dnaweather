-if class net.github.dn12.network.api.response.Weather
-keepnames class net.github.dn12.network.api.response.Weather
-if class net.github.dn12.network.api.response.Weather
-keep class net.github.dn12.network.api.response.WeatherJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class net.github.dn12.network.api.response.Weather
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class net.github.dn12.network.api.response.Weather
-keepclassmembers class net.github.dn12.network.api.response.Weather {
    public synthetic <init>(java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

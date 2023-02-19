-if class net.github.dn12.network.api.response.CityWeatherResponse
-keepnames class net.github.dn12.network.api.response.CityWeatherResponse
-if class net.github.dn12.network.api.response.CityWeatherResponse
-keep class net.github.dn12.network.api.response.CityWeatherResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class net.github.dn12.network.api.response.CityWeatherResponse
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class net.github.dn12.network.api.response.CityWeatherResponse
-keepclassmembers class net.github.dn12.network.api.response.CityWeatherResponse {
    public synthetic <init>(int,java.lang.String,java.util.List,net.github.dn12.network.api.response.Main,net.github.dn12.network.api.response.Wind,net.github.dn12.network.api.response.Sys,long,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

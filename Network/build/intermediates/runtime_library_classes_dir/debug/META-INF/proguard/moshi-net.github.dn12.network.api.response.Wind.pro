-if class net.github.dn12.network.api.response.Wind
-keepnames class net.github.dn12.network.api.response.Wind
-if class net.github.dn12.network.api.response.Wind
-keep class net.github.dn12.network.api.response.WindJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class net.github.dn12.network.api.response.Wind
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class net.github.dn12.network.api.response.Wind
-keepclassmembers class net.github.dn12.network.api.response.Wind {
    public synthetic <init>(double,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

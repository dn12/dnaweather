-if class net.github.dn12.network.api.response.Main
-keepnames class net.github.dn12.network.api.response.Main
-if class net.github.dn12.network.api.response.Main
-keep class net.github.dn12.network.api.response.MainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class net.github.dn12.network.api.response.Main
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class net.github.dn12.network.api.response.Main
-keepclassmembers class net.github.dn12.network.api.response.Main {
    public synthetic <init>(double,double,double,double,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

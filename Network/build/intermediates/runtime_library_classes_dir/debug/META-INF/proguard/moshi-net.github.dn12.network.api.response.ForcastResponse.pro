-if class net.github.dn12.network.api.response.ForcastResponse
-keepnames class net.github.dn12.network.api.response.ForcastResponse
-if class net.github.dn12.network.api.response.ForcastResponse
-keep class net.github.dn12.network.api.response.ForcastResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class net.github.dn12.network.api.response.ForcastResponse
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class net.github.dn12.network.api.response.ForcastResponse
-keepclassmembers class net.github.dn12.network.api.response.ForcastResponse {
    public synthetic <init>(java.lang.Integer,java.lang.String,java.util.List,java.lang.Integer,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

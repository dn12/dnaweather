-if class net.github.dn12.network.model.City
-keepnames class net.github.dn12.network.model.City
-if class net.github.dn12.network.model.City
-keep class net.github.dn12.network.model.CityJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class net.github.dn12.network.model.City
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class net.github.dn12.network.model.City
-keepclassmembers class net.github.dn12.network.model.City {
    public synthetic <init>(java.lang.String,java.lang.Double,java.lang.Double,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

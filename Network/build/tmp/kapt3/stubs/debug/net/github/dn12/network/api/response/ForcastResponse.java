package net.github.dn12.network.api.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJF\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lnet/github/dn12/network/api/response/ForcastResponse;", "", "cnt", "", "cod", "", "list", "", "Lnet/github/dn12/network/api/response/CityWeatherResponse;", "message", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getCnt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCod", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lnet/github/dn12/network/api/response/ForcastResponse;", "equals", "", "other", "hashCode", "toString", "Network_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ForcastResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer cnt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cod = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<net.github.dn12.network.api.response.CityWeatherResponse> list = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer message = null;
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.api.response.ForcastResponse copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cnt")
    java.lang.Integer cnt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.String cod, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "list")
    java.util.List<net.github.dn12.network.api.response.CityWeatherResponse> list, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "message")
    java.lang.Integer message) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ForcastResponse() {
        super();
    }
    
    public ForcastResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cnt")
    java.lang.Integer cnt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.String cod, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "list")
    java.util.List<net.github.dn12.network.api.response.CityWeatherResponse> list, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "message")
    java.lang.Integer message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCnt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<net.github.dn12.network.api.response.CityWeatherResponse> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<net.github.dn12.network.api.response.CityWeatherResponse> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMessage() {
        return null;
    }
}
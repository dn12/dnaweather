package net.github.dn12.network.api.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lnet/github/dn12/network/api/response/Main;", "", "temp", "", "feelsLike", "tempMin", "tempMax", "(DDDD)V", "getFeelsLike", "()D", "setFeelsLike", "(D)V", "getTemp", "setTemp", "getTempMax", "setTempMax", "getTempMin", "setTempMin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Network_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Main {
    private double temp;
    private double feelsLike;
    private double tempMin;
    private double tempMax;
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.api.response.Main copy(double temp, @com.squareup.moshi.Json(name = "feels_like")
    double feelsLike, @com.squareup.moshi.Json(name = "temp_min")
    double tempMin, @com.squareup.moshi.Json(name = "temp_max")
    double tempMax) {
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
    
    public Main() {
        super();
    }
    
    public Main(double temp, @com.squareup.moshi.Json(name = "feels_like")
    double feelsLike, @com.squareup.moshi.Json(name = "temp_min")
    double tempMin, @com.squareup.moshi.Json(name = "temp_max")
    double tempMax) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final void setTemp(double p0) {
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getFeelsLike() {
        return 0.0;
    }
    
    public final void setFeelsLike(double p0) {
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getTempMin() {
        return 0.0;
    }
    
    public final void setTempMin(double p0) {
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getTempMax() {
        return 0.0;
    }
    
    public final void setTempMax(double p0) {
    }
}
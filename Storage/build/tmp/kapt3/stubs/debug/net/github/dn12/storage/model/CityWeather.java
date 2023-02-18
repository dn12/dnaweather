package net.github.dn12.storage.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014\u00a8\u0006-"}, d2 = {"Lnet/github/dn12/storage/model/CityWeather;", "Lio/realm/RealmObject;", "id", "", "name", "", "weatherMain", "temp", "", "tempMin", "tempMax", "feelsLike", "windSpeed", "sysSunrise", "timeInMillis", "", "(ILjava/lang/String;Ljava/lang/String;DDDDDLjava/lang/String;J)V", "getFeelsLike", "()D", "setFeelsLike", "(D)V", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSysSunrise", "setSysSunrise", "getTemp", "setTemp", "getTempMax", "setTempMax", "getTempMin", "setTempMin", "getTimeInMillis", "()J", "setTimeInMillis", "(J)V", "getWeatherMain", "setWeatherMain", "getWindSpeed", "setWindSpeed", "Storage_debug"})
public class CityWeather extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String weatherMain;
    private double temp;
    private double tempMin;
    private double tempMax;
    private double feelsLike;
    private double windSpeed;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sysSunrise;
    private long timeInMillis;
    
    public CityWeather() {
        super();
    }
    
    public CityWeather(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String weatherMain, double temp, double tempMin, double tempMax, double feelsLike, double windSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String sysSunrise, long timeInMillis) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeatherMain() {
        return null;
    }
    
    public final void setWeatherMain(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final void setTemp(double p0) {
    }
    
    public final double getTempMin() {
        return 0.0;
    }
    
    public final void setTempMin(double p0) {
    }
    
    public final double getTempMax() {
        return 0.0;
    }
    
    public final void setTempMax(double p0) {
    }
    
    public final double getFeelsLike() {
        return 0.0;
    }
    
    public final void setFeelsLike(double p0) {
    }
    
    public final double getWindSpeed() {
        return 0.0;
    }
    
    public final void setWindSpeed(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSysSunrise() {
        return null;
    }
    
    public final void setSysSunrise(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getTimeInMillis() {
        return 0L;
    }
    
    public final void setTimeInMillis(long p0) {
    }
}
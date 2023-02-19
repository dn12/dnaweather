package net.github.dn12.network.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lnet/github/dn12/network/repositories/CitiesWeatherRepository;", "", "citiesWeatherService", "Lnet/github/dn12/network/api/CitiesWeatherService;", "(Lnet/github/dn12/network/api/CitiesWeatherService;)V", "getCityForecastWeather", "Lnet/github/dn12/network/util/MyNetworkRequestResult;", "Lnet/github/dn12/network/api/response/ForcastResponse;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCityWeather", "Lnet/github/dn12/network/api/response/CityWeatherResponse;", "cityId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Network_debug"})
public final class CitiesWeatherRepository {
    private final net.github.dn12.network.api.CitiesWeatherService citiesWeatherService = null;
    
    public CitiesWeatherRepository(@org.jetbrains.annotations.NotNull()
    net.github.dn12.network.api.CitiesWeatherService citiesWeatherService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCityWeather(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.github.dn12.network.util.MyNetworkRequestResult<net.github.dn12.network.api.response.CityWeatherResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCityWeather(int cityId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.github.dn12.network.util.MyNetworkRequestResult<net.github.dn12.network.api.response.CityWeatherResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCityForecastWeather(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.github.dn12.network.util.MyNetworkRequestResult<net.github.dn12.network.api.response.ForcastResponse>> continuation) {
        return null;
    }
}
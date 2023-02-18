package net.github.dn12.network.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lnet/github/dn12/network/repositories/CitiesRepository;", "", "service", "Lnet/github/dn12/network/api/CitiesServiceImpl;", "onlineServices", "Lnet/github/dn12/network/api/CitiesOnlineService;", "(Lnet/github/dn12/network/api/CitiesServiceImpl;Lnet/github/dn12/network/api/CitiesOnlineService;)V", "getCities", "Lnet/github/dn12/network/util/MyNetworkRequestResult;", "", "Lnet/github/dn12/network/model/City;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCities", "", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Network_debug"})
public final class CitiesRepository {
    private final net.github.dn12.network.api.CitiesServiceImpl service = null;
    private final net.github.dn12.network.api.CitiesOnlineService onlineServices = null;
    
    public CitiesRepository(@org.jetbrains.annotations.NotNull()
    net.github.dn12.network.api.CitiesServiceImpl service, @org.jetbrains.annotations.NotNull()
    net.github.dn12.network.api.CitiesOnlineService onlineServices) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.github.dn12.network.util.MyNetworkRequestResult<? extends java.util.List<net.github.dn12.network.model.City>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchCities(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.github.dn12.network.util.MyNetworkRequestResult<? extends java.util.List<net.github.dn12.network.model.City>>> continuation) {
        return null;
    }
}
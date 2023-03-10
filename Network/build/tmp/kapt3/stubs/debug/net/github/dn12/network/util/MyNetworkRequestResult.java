package net.github.dn12.network.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u0017*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lnet/github/dn12/network/util/MyNetworkRequestResult;", "T", "", "callResult", "Lnet/github/dn12/network/util/MyNetworkCallResult;", "data", "(Lnet/github/dn12/network/util/MyNetworkCallResult;Ljava/lang/Object;)V", "getCallResult", "()Lnet/github/dn12/network/util/MyNetworkCallResult;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lnet/github/dn12/network/util/MyNetworkCallResult;Ljava/lang/Object;)Lnet/github/dn12/network/util/MyNetworkRequestResult;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Network_debug"})
public final class MyNetworkRequestResult<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final net.github.dn12.network.util.MyNetworkCallResult callResult = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.github.dn12.network.util.MyNetworkRequestResult.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.util.MyNetworkRequestResult<T> copy(@org.jetbrains.annotations.NotNull()
    net.github.dn12.network.util.MyNetworkCallResult callResult, @org.jetbrains.annotations.Nullable()
    T data) {
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
    
    public MyNetworkRequestResult(@org.jetbrains.annotations.NotNull()
    net.github.dn12.network.util.MyNetworkCallResult callResult, @org.jetbrains.annotations.Nullable()
    T data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.util.MyNetworkCallResult component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.util.MyNetworkCallResult getCallResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J#\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lnet/github/dn12/network/util/MyNetworkRequestResult$Companion;", "", "()V", "error", "Lnet/github/dn12/network/util/MyNetworkRequestResult;", "T", "callResultError", "Lnet/github/dn12/network/util/MyNetworkCallResult;", "success", "data", "(Ljava/lang/Object;)Lnet/github/dn12/network/util/MyNetworkRequestResult;", "Network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>net.github.dn12.network.util.MyNetworkRequestResult<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>net.github.dn12.network.util.MyNetworkRequestResult<T> error(@org.jetbrains.annotations.NotNull()
        net.github.dn12.network.util.MyNetworkCallResult callResultError) {
            return null;
        }
    }
}
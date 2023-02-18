package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class net_github_dn12_storage_model_CityWeatherRealmProxy extends net.github.dn12.storage.model.CityWeather
    implements RealmObjectProxy, net_github_dn12_storage_model_CityWeatherRealmProxyInterface {

    static final class CityWeatherColumnInfo extends ColumnInfo {
        long idColKey;
        long nameColKey;
        long weatherMainColKey;
        long tempColKey;
        long tempMinColKey;
        long tempMaxColKey;
        long feelsLikeColKey;
        long windSpeedColKey;
        long sysSunriseColKey;
        long timeInMillisColKey;

        CityWeatherColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CityWeather");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.weatherMainColKey = addColumnDetails("weatherMain", "weatherMain", objectSchemaInfo);
            this.tempColKey = addColumnDetails("temp", "temp", objectSchemaInfo);
            this.tempMinColKey = addColumnDetails("tempMin", "tempMin", objectSchemaInfo);
            this.tempMaxColKey = addColumnDetails("tempMax", "tempMax", objectSchemaInfo);
            this.feelsLikeColKey = addColumnDetails("feelsLike", "feelsLike", objectSchemaInfo);
            this.windSpeedColKey = addColumnDetails("windSpeed", "windSpeed", objectSchemaInfo);
            this.sysSunriseColKey = addColumnDetails("sysSunrise", "sysSunrise", objectSchemaInfo);
            this.timeInMillisColKey = addColumnDetails("timeInMillis", "timeInMillis", objectSchemaInfo);
        }

        CityWeatherColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CityWeatherColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CityWeatherColumnInfo src = (CityWeatherColumnInfo) rawSrc;
            final CityWeatherColumnInfo dst = (CityWeatherColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.nameColKey = src.nameColKey;
            dst.weatherMainColKey = src.weatherMainColKey;
            dst.tempColKey = src.tempColKey;
            dst.tempMinColKey = src.tempMinColKey;
            dst.tempMaxColKey = src.tempMaxColKey;
            dst.feelsLikeColKey = src.feelsLikeColKey;
            dst.windSpeedColKey = src.windSpeedColKey;
            dst.sysSunriseColKey = src.sysSunriseColKey;
            dst.timeInMillisColKey = src.timeInMillisColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CityWeatherColumnInfo columnInfo;
    private ProxyState<net.github.dn12.storage.model.CityWeather> proxyState;

    net_github_dn12_storage_model_CityWeatherRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CityWeatherColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<net.github.dn12.storage.model.CityWeather>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$weatherMain() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.weatherMainColKey);
    }

    @Override
    public void realmSet$weatherMain(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'weatherMain' to null.");
            }
            row.getTable().setString(columnInfo.weatherMainColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'weatherMain' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.weatherMainColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$temp() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.tempColKey);
    }

    @Override
    public void realmSet$temp(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.tempColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.tempColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$tempMin() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.tempMinColKey);
    }

    @Override
    public void realmSet$tempMin(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.tempMinColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.tempMinColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$tempMax() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.tempMaxColKey);
    }

    @Override
    public void realmSet$tempMax(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.tempMaxColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.tempMaxColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$feelsLike() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.feelsLikeColKey);
    }

    @Override
    public void realmSet$feelsLike(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.feelsLikeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.feelsLikeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$windSpeed() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.windSpeedColKey);
    }

    @Override
    public void realmSet$windSpeed(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.windSpeedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.windSpeedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sysSunrise() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sysSunriseColKey);
    }

    @Override
    public void realmSet$sysSunrise(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sysSunrise' to null.");
            }
            row.getTable().setString(columnInfo.sysSunriseColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'sysSunrise' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.sysSunriseColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeInMillis() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeInMillisColKey);
    }

    @Override
    public void realmSet$timeInMillis(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeInMillisColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeInMillisColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "CityWeather", false, 10, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "weatherMain", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "temp", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tempMin", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tempMax", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "feelsLike", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "windSpeed", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "sysSunrise", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "timeInMillis", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CityWeatherColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CityWeatherColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CityWeather";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CityWeather";
    }

    @SuppressWarnings("cast")
    public static net.github.dn12.storage.model.CityWeather createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        net.github.dn12.storage.model.CityWeather obj = null;
        if (update) {
            Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
            CityWeatherColumnInfo columnInfo = (CityWeatherColumnInfo) realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class), false, Collections.<String> emptyList());
                    obj = new io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy) realm.createObjectInternal(net.github.dn12.storage.model.CityWeather.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy) realm.createObjectInternal(net.github.dn12.storage.model.CityWeather.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final net_github_dn12_storage_model_CityWeatherRealmProxyInterface objProxy = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("weatherMain")) {
            if (json.isNull("weatherMain")) {
                objProxy.realmSet$weatherMain(null);
            } else {
                objProxy.realmSet$weatherMain((String) json.getString("weatherMain"));
            }
        }
        if (json.has("temp")) {
            if (json.isNull("temp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'temp' to null.");
            } else {
                objProxy.realmSet$temp((double) json.getDouble("temp"));
            }
        }
        if (json.has("tempMin")) {
            if (json.isNull("tempMin")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tempMin' to null.");
            } else {
                objProxy.realmSet$tempMin((double) json.getDouble("tempMin"));
            }
        }
        if (json.has("tempMax")) {
            if (json.isNull("tempMax")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tempMax' to null.");
            } else {
                objProxy.realmSet$tempMax((double) json.getDouble("tempMax"));
            }
        }
        if (json.has("feelsLike")) {
            if (json.isNull("feelsLike")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'feelsLike' to null.");
            } else {
                objProxy.realmSet$feelsLike((double) json.getDouble("feelsLike"));
            }
        }
        if (json.has("windSpeed")) {
            if (json.isNull("windSpeed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'windSpeed' to null.");
            } else {
                objProxy.realmSet$windSpeed((double) json.getDouble("windSpeed"));
            }
        }
        if (json.has("sysSunrise")) {
            if (json.isNull("sysSunrise")) {
                objProxy.realmSet$sysSunrise(null);
            } else {
                objProxy.realmSet$sysSunrise((String) json.getString("sysSunrise"));
            }
        }
        if (json.has("timeInMillis")) {
            if (json.isNull("timeInMillis")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeInMillis' to null.");
            } else {
                objProxy.realmSet$timeInMillis((long) json.getLong("timeInMillis"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static net.github.dn12.storage.model.CityWeather createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final net.github.dn12.storage.model.CityWeather obj = new net.github.dn12.storage.model.CityWeather();
        final net_github_dn12_storage_model_CityWeatherRealmProxyInterface objProxy = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("weatherMain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$weatherMain((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$weatherMain(null);
                }
            } else if (name.equals("temp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$temp((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'temp' to null.");
                }
            } else if (name.equals("tempMin")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tempMin((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tempMin' to null.");
                }
            } else if (name.equals("tempMax")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tempMax((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tempMax' to null.");
                }
            } else if (name.equals("feelsLike")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$feelsLike((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'feelsLike' to null.");
                }
            } else if (name.equals("windSpeed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$windSpeed((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'windSpeed' to null.");
                }
            } else if (name.equals("sysSunrise")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sysSunrise((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sysSunrise(null);
                }
            } else if (name.equals("timeInMillis")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeInMillis((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeInMillis' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static net_github_dn12_storage_model_CityWeatherRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class), false, Collections.<String>emptyList());
        io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy obj = new io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static net.github.dn12.storage.model.CityWeather copyOrUpdate(Realm realm, CityWeatherColumnInfo columnInfo, net.github.dn12.storage.model.CityWeather object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (net.github.dn12.storage.model.CityWeather) cachedRealmObject;
        }

        net.github.dn12.storage.model.CityWeather realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static net.github.dn12.storage.model.CityWeather copy(Realm realm, CityWeatherColumnInfo columnInfo, net.github.dn12.storage.model.CityWeather newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (net.github.dn12.storage.model.CityWeather) cachedRealmObject;
        }

        net_github_dn12_storage_model_CityWeatherRealmProxyInterface unmanagedSource = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) newObject;

        Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.weatherMainColKey, unmanagedSource.realmGet$weatherMain());
        builder.addDouble(columnInfo.tempColKey, unmanagedSource.realmGet$temp());
        builder.addDouble(columnInfo.tempMinColKey, unmanagedSource.realmGet$tempMin());
        builder.addDouble(columnInfo.tempMaxColKey, unmanagedSource.realmGet$tempMax());
        builder.addDouble(columnInfo.feelsLikeColKey, unmanagedSource.realmGet$feelsLike());
        builder.addDouble(columnInfo.windSpeedColKey, unmanagedSource.realmGet$windSpeed());
        builder.addString(columnInfo.sysSunriseColKey, unmanagedSource.realmGet$sysSunrise());
        builder.addInteger(columnInfo.timeInMillisColKey, unmanagedSource.realmGet$timeInMillis());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.net_github_dn12_storage_model_CityWeatherRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, net.github.dn12.storage.model.CityWeather object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
        long tableNativePtr = table.getNativePtr();
        CityWeatherColumnInfo columnInfo = (CityWeatherColumnInfo) realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$weatherMain = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$weatherMain();
        if (realmGet$weatherMain != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.weatherMainColKey, objKey, realmGet$weatherMain, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.tempColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$temp(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMin(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMax(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.feelsLikeColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$feelsLike(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.windSpeedColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$windSpeed(), false);
        String realmGet$sysSunrise = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$sysSunrise();
        if (realmGet$sysSunrise != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sysSunriseColKey, objKey, realmGet$sysSunrise, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeInMillisColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$timeInMillis(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
        long tableNativePtr = table.getNativePtr();
        CityWeatherColumnInfo columnInfo = (CityWeatherColumnInfo) realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class);
        long pkColumnKey = columnInfo.idColKey;
        net.github.dn12.storage.model.CityWeather object = null;
        while (objects.hasNext()) {
            object = (net.github.dn12.storage.model.CityWeather) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$weatherMain = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$weatherMain();
            if (realmGet$weatherMain != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.weatherMainColKey, objKey, realmGet$weatherMain, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$temp(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMin(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMax(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.feelsLikeColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$feelsLike(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.windSpeedColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$windSpeed(), false);
            String realmGet$sysSunrise = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$sysSunrise();
            if (realmGet$sysSunrise != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sysSunriseColKey, objKey, realmGet$sysSunrise, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeInMillisColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$timeInMillis(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, net.github.dn12.storage.model.CityWeather object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
        long tableNativePtr = table.getNativePtr();
        CityWeatherColumnInfo columnInfo = (CityWeatherColumnInfo) realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$name = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$weatherMain = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$weatherMain();
        if (realmGet$weatherMain != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.weatherMainColKey, objKey, realmGet$weatherMain, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.weatherMainColKey, objKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.tempColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$temp(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMin(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMax(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.feelsLikeColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$feelsLike(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.windSpeedColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$windSpeed(), false);
        String realmGet$sysSunrise = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$sysSunrise();
        if (realmGet$sysSunrise != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sysSunriseColKey, objKey, realmGet$sysSunrise, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sysSunriseColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeInMillisColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$timeInMillis(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
        long tableNativePtr = table.getNativePtr();
        CityWeatherColumnInfo columnInfo = (CityWeatherColumnInfo) realm.getSchema().getColumnInfo(net.github.dn12.storage.model.CityWeather.class);
        long pkColumnKey = columnInfo.idColKey;
        net.github.dn12.storage.model.CityWeather object = null;
        while (objects.hasNext()) {
            object = (net.github.dn12.storage.model.CityWeather) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$name = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$weatherMain = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$weatherMain();
            if (realmGet$weatherMain != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.weatherMainColKey, objKey, realmGet$weatherMain, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.weatherMainColKey, objKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$temp(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMin(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$tempMax(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.feelsLikeColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$feelsLike(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.windSpeedColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$windSpeed(), false);
            String realmGet$sysSunrise = ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$sysSunrise();
            if (realmGet$sysSunrise != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sysSunriseColKey, objKey, realmGet$sysSunrise, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sysSunriseColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeInMillisColKey, objKey, ((net_github_dn12_storage_model_CityWeatherRealmProxyInterface) object).realmGet$timeInMillis(), false);
        }
    }

    public static net.github.dn12.storage.model.CityWeather createDetachedCopy(net.github.dn12.storage.model.CityWeather realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        net.github.dn12.storage.model.CityWeather unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new net.github.dn12.storage.model.CityWeather();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (net.github.dn12.storage.model.CityWeather) cachedObject.object;
            }
            unmanagedObject = (net.github.dn12.storage.model.CityWeather) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        net_github_dn12_storage_model_CityWeatherRealmProxyInterface unmanagedCopy = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) unmanagedObject;
        net_github_dn12_storage_model_CityWeatherRealmProxyInterface realmSource = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$weatherMain(realmSource.realmGet$weatherMain());
        unmanagedCopy.realmSet$temp(realmSource.realmGet$temp());
        unmanagedCopy.realmSet$tempMin(realmSource.realmGet$tempMin());
        unmanagedCopy.realmSet$tempMax(realmSource.realmGet$tempMax());
        unmanagedCopy.realmSet$feelsLike(realmSource.realmGet$feelsLike());
        unmanagedCopy.realmSet$windSpeed(realmSource.realmGet$windSpeed());
        unmanagedCopy.realmSet$sysSunrise(realmSource.realmGet$sysSunrise());
        unmanagedCopy.realmSet$timeInMillis(realmSource.realmGet$timeInMillis());

        return unmanagedObject;
    }

    static net.github.dn12.storage.model.CityWeather update(Realm realm, CityWeatherColumnInfo columnInfo, net.github.dn12.storage.model.CityWeather realmObject, net.github.dn12.storage.model.CityWeather newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        net_github_dn12_storage_model_CityWeatherRealmProxyInterface realmObjectTarget = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) realmObject;
        net_github_dn12_storage_model_CityWeatherRealmProxyInterface realmObjectSource = (net_github_dn12_storage_model_CityWeatherRealmProxyInterface) newObject;
        Table table = realm.getTable(net.github.dn12.storage.model.CityWeather.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.weatherMainColKey, realmObjectSource.realmGet$weatherMain());
        builder.addDouble(columnInfo.tempColKey, realmObjectSource.realmGet$temp());
        builder.addDouble(columnInfo.tempMinColKey, realmObjectSource.realmGet$tempMin());
        builder.addDouble(columnInfo.tempMaxColKey, realmObjectSource.realmGet$tempMax());
        builder.addDouble(columnInfo.feelsLikeColKey, realmObjectSource.realmGet$feelsLike());
        builder.addDouble(columnInfo.windSpeedColKey, realmObjectSource.realmGet$windSpeed());
        builder.addString(columnInfo.sysSunriseColKey, realmObjectSource.realmGet$sysSunrise());
        builder.addInteger(columnInfo.timeInMillisColKey, realmObjectSource.realmGet$timeInMillis());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CityWeather = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{weatherMain:");
        stringBuilder.append(realmGet$weatherMain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{temp:");
        stringBuilder.append(realmGet$temp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tempMin:");
        stringBuilder.append(realmGet$tempMin());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tempMax:");
        stringBuilder.append(realmGet$tempMax());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{feelsLike:");
        stringBuilder.append(realmGet$feelsLike());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{windSpeed:");
        stringBuilder.append(realmGet$windSpeed());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sysSunrise:");
        stringBuilder.append(realmGet$sysSunrise());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeInMillis:");
        stringBuilder.append(realmGet$timeInMillis());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        net_github_dn12_storage_model_CityWeatherRealmProxy aCityWeather = (net_github_dn12_storage_model_CityWeatherRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCityWeather.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCityWeather.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCityWeather.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}

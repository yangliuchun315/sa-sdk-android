package com.sensorsdata.analytics.android.sdk;

import android.content.SharedPreferences;

import java.util.concurrent.Future;

public class PersistentAppEndData extends PersistentIdentity<String> {
    PersistentAppEndData(Future<SharedPreferences> loadStoredPreferences) {
        super(loadStoredPreferences, DbAdapter.APP_END_DATA, new PersistentSerializer<String>() {
            @Override
            public String load(String value) {
                return value;
            }

            @Override
            public String save(String item) {
                return item;
            }

            @Override
            public String create() {
                return "";
            }
        });
    }
}

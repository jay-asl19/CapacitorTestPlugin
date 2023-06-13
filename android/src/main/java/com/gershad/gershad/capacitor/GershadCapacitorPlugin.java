package com.gershad.gershad.capacitor;

import android.util.Log;

public class GershadCapacitorPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}

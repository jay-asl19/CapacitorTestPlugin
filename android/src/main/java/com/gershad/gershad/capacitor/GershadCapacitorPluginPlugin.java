package com.gershad.gershad.capacitor;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "GershadCapacitorPlugin")
public class GershadCapacitorPluginPlugin extends Plugin {

    private GershadCapacitorPlugin implementation = new GershadCapacitorPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        Toast.makeText(getContext(), "Holla boy plugin value is" + value, Toast.LENGTH_SHORT).show();
        call.resolve(ret);
    }
}

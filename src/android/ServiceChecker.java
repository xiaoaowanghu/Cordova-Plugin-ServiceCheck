package cordova.plugin.flying;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by wangxian on 2017/11/16.
 */

public class ServiceChecker extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkGooglePlayService")) {
            int val = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.cordova.getActivity().getApplicationContext());
            LOG.d("checkGooglePlayService", "result=" + val);
            JSONObject res = new JSONObject().put("isGooglePlayServicesAvailable", !(val == ConnectionResult.SERVICE_MISSING && val == ConnectionResult.SERVICE_DISABLED));
            callbackContext.success(res);
            return true;
        } else {
            return false;
        }
    }

}

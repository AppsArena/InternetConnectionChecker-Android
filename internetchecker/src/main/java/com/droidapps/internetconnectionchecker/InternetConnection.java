package com.droidapps.internetconnectionchecker;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.droidapps.internetconnectionchecker.interfaces.InternetConnectionListener;

public class InternetConnection {

    private InternetConnectionListener internetConnectionListener;
    private Context context;

    public InternetConnection(Context context, InternetConnectionListener internetConnectionListener) {
        this.context = context;
        this.internetConnectionListener = internetConnectionListener;

        //call checkConnection() method
        checkConnection(context);
    }


    /**
     * CHECK WHETHER INTERNET CONNECTION IS AVAILABLE OR NOT
     */
    private void checkConnection(Context context) {
        final ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetworkInfo = connMgr.getActiveNetworkInfo();

        if (activeNetworkInfo != null) {
            // connected to the internet
            if (activeNetworkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                // connected to wifi
                internetConnectionListener.onInternetConnectionEnable();
            } else if (activeNetworkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                // connected to the mobile provider's data plan
                internetConnectionListener.onInternetConnectionEnable();
            }
        } else {
            //not connected
            internetConnectionListener.onInternetConnectionDisable();
        }

    }
}

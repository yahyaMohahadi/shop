package org.maktab.market.service;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

import org.maktab.market.data.repository.GoodsRepository;

public class InternetService extends JobIntentService {

    public static final String KEY_PAGE = "org.maktab.market.servicePAGEOFSITE";
    private static final int JOB_ID = 0;

    public static Intent getIntent(Context context, int page) {
        Intent intent = new Intent(context, InternetService.class);
        intent.putExtra(KEY_PAGE, page);
        return intent;
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, InternetService.class, JOB_ID, intent);
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        if (isNetworkAvailable(this)) {
            int page = intent.getIntExtra(KEY_PAGE, 0);
            GoodsRepository.newInstance(this).getListGoods(page);
        }else {
            //todo logic for not have net
        }
    }


    public static boolean isNetworkAvailable(Context context) {
        if (context == null) return false;


        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (capabilities != null) {
                    return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
                            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET);
                }
            } else {

                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        return true;
                    }
                } catch (Exception e) {
                }
            }
        }
        return false;
    }
}

package Constract;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by tinyzo on 2016-12-15.
 */

public class MyApplication extends Application {
    private static MyApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplication = this;

    }

    public static OkHttpClient defaultOkHttpClient() {
        HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .writeTimeout(3, TimeUnit.SECONDS)
                .readTimeout(3, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();
        return client;
    }

    public static MyApplication getIntstance() {
        return mApplication;
    }
}

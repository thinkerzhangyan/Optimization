package tk.thinkerzhangyan.optimization;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by macbook on 2017/9/12.
 */

public class BaseApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}

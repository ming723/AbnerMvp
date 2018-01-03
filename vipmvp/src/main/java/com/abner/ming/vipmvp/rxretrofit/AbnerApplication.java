package com.abner.ming.vipmvp.rxretrofit;

import android.app.Application;

import com.abner.ming.vipmvp.rxretrofit.utils.HttpUtils;
import com.hss01248.dialog.StyledDialog;

/**
 * Created by AbnerMing on 2018/1/3.
 */

public class AbnerApplication extends Application{
    private static AbnerApplication INSTANCE;
    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        StyledDialog.init(this);
        HttpUtils.getmHttpUtils().create();
    }
    public static AbnerApplication getInstance(){
        if (INSTANCE == null){
            synchronized (AbnerApplication.class){
                INSTANCE = new AbnerApplication();
            }
        }
        return INSTANCE;
    }
}

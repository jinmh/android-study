package com.demo.wanpeng.study;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.ab.global.AbAppConfig;

public class MyApplication extends Application {

	public String cityid = Constant.DEFAULTCITYID;
	public String cityName = Constant.DEFAULTCITYNAME;
	public boolean userPasswordRemember = false;
	public boolean ad = false;
	public boolean isFirstStart = true;
	public SharedPreferences mSharedPreferences = null;

	@Override
	public void onCreate() {
		super.onCreate();
		mSharedPreferences = getSharedPreferences(AbAppConfig.SHARED_PATH,
				Context.MODE_PRIVATE);

	}


	
	@Override
	public void onTerminate() {
		super.onTerminate();
	}

}

package com.demo.wanpeng.study.db;

import android.content.Context;

import com.ab.db.orm.AbSDDBHelper;
import com.ab.util.AbFileUtil;
import com.demo.wanpeng.study.model.Friend;
import com.demo.wanpeng.study.model.IMMessage;
import com.demo.wanpeng.study.model.LocalUser;
import com.demo.wanpeng.study.model.Stock;
import com.demo.wanpeng.study.model.User;

public class DBSDHelper extends AbSDDBHelper {
	// 数据库名
	private static final String DBNAME = "andbasedemo.db";
    
    // 当前数据库的版本
	private static final int DBVERSION = 1;
	// 要初始化的表
	private static final Class<?>[] clazz = { User.class,LocalUser.class,Stock.class,Friend.class,IMMessage.class};

	public DBSDHelper(Context context) {
		super(context,AbFileUtil.getDbDownloadDir(context), DBNAME, null, DBVERSION, clazz);
	}

}




package com.demo.wanpeng.study.dao;

import android.content.Context;

import com.ab.db.orm.dao.AbDBDaoImpl;
import com.demo.wanpeng.study.db.DBSDHelper;
import com.demo.wanpeng.study.model.LocalUser;
/**
 * 
 * © 2012 amsoft.cn
 * 名称：UserDao.java 
 * 描述：本地数据库在sd中
 * @author 还如一梦中
 * @date：2013-7-31 下午4:13:02
 * @version v1.0
 */
public class UserSDDao extends AbDBDaoImpl<LocalUser> {
	public UserSDDao(Context context) {
		super(new DBSDHelper(context),LocalUser.class);
	}
}

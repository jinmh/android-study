package com.demo.wanpeng.study.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ab.activity.AbActivity;
import com.ab.view.titlebar.AbTitleBar;
import com.demo.wanpeng.study.MyApplication;
import com.demo.wanpeng.study.R;
/**
 * 名称：CarouselActivity
 * 描述：旋转木马
 * @author 还如一梦中
 * @date 2011-12-13
 * @version
 */
public class CarouselActivity extends AbActivity {
	
	private MyApplication application;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setAbContentView(R.layout.carousel_main);
        
        AbTitleBar mAbTitleBar = this.getTitleBar();
        mAbTitleBar.setTitleText(R.string.carousel_name);
        mAbTitleBar.setLogo(R.drawable.button_selector_back);
        mAbTitleBar.setTitleBarBackground(R.drawable.top_bg);
        mAbTitleBar.setTitleTextMargin(10, 0, 0, 0);
        mAbTitleBar.setLogoLine(R.drawable.line);
	    
        application = (MyApplication)abApplication;
        Button btn1  = (Button)this.findViewById(R.id.btn1);
        Button btn2  = (Button)this.findViewById(R.id.btn2);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(CarouselActivity.this,CarouselImageActivity.class); 
 				startActivity(intent);
			}
		});
        
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(CarouselActivity.this,CarouselViewActivity.class); 
 				startActivity(intent);
			}
		});
        
       
      } 
    
}

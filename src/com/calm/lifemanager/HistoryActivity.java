package com.calm.lifemanager;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class HistoryActivity extends TabActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_history);
		
		TabHost tabHost = getTabHost();
		
//		TabView view = null;
//		
//		// ʱ��
//		view = new TabView(this,R.drawable.ic_launcher,R.drawable.ic_launcher);
//		view.setBackground(this.getResources().getDrawable(R.drawable.ic_launcher));
//		
//		TabSpec timeSpec = tabHost.newTabSpec("bottom_tab1");
//		//timeSpec.setIndicator(view);
//		timeSpec.setIndicator("ʱ��");
//		
//		Intent timeIntent = new Intent(this,TimeHistoryActivity.class);
//		timeSpec.setContent(timeIntent);
//		
//		// ����
//		view = new TabView(this, R.drawable.ic_launcher, R.drawable.ic_launcher);
//		view.setBackground(this.getResources().getDrawable(
//				R.drawable.ic_launcher));
//
//		TabSpec moodSpec = tabHost.newTabSpec("bottom_tab2");
//		//timeSpec.setIndicator(view);
//		timeSpec.setIndicator("����");
//		Intent moodIntent = new Intent(this, MoodHistoryActivity.class);
//		timeSpec.setContent(moodIntent);
//		
//		tabHost.addTab(timeSpec);
//		tabHost.addTab(moodSpec);
		
		//ΪTabHost���ӱ�ǩ     
        //�½�һ��newTabSpec(newTabSpec)     
        //�������ǩ��ͼ�꣨setIndicator��     
        //�������ݣ�setContent��     
		Intent timeIntent = new Intent(this,TimeHistoryActivity.class);
		
        tabHost.addTab(tabHost.newTabSpec("bottom_tab1")     
                .setIndicator("ʱ��",getResources().getDrawable(R.drawable.ic_launcher))     
                .setContent(timeIntent));
        
        Intent moodIntent = new Intent(this, MoodHistoryActivity.class);
        tabHost.addTab(tabHost.newTabSpec("bottom_tab2")     
                .setIndicator("����",getResources().getDrawable(R.drawable.ic_launcher))     
                .setContent(moodIntent));
		
		tabHost.setCurrentTab(0);
	}
}
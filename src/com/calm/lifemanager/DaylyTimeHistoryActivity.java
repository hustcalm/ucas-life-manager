package com.calm.lifemanager;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TabHost;

public class DaylyTimeHistoryActivity extends TabActivity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        TabHost tabHost = getTabHost();
	        
	        LayoutInflater.from(this).inflate(R.layout.activity_history_time_dayly,tabHost.getTabContentView(),true);
	        
	        TabView timeCostView = null;
	        timeCostView = new TabView(this,R.drawable.btn_time,R.drawable.btn_time);
	        timeCostView.setBackground(this.getResources().getDrawable(R.drawable.btn_time));
			
			TabView efficientView = null;
			efficientView = new TabView(this,R.drawable.btn_efficient,R.drawable.btn_efficient);
			efficientView.setBackground(this.getResources().getDrawable(R.drawable.btn_efficient));
			
			TabView detailsView = null;
			detailsView = new TabView(this,R.drawable.btn_sheet,R.drawable.btn_sheet);
			detailsView.setBackground(this.getResources().getDrawable(R.drawable.btn_sheet));
			
	        tabHost.addTab(tabHost.newTabSpec("tab1")
	                .setIndicator(timeCostView)
	                .setContent(R.id.activity_history_time_daily_time_cost));
	        
	        tabHost.addTab(tabHost.newTabSpec("tab2")
	                .setIndicator(efficientView)     
	                .setContent(R.id.activity_history_time_daily_efficient));
	        
	        tabHost.addTab(tabHost.newTabSpec("tab3")
	                .setIndicator(detailsView)     
	                .setContent(R.id.activity_history_time_daily_details));
			
			tabHost.setCurrentTab(0);  
			
			//���Ӽ����¼�  
	        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {  
	              
	            public void onTabChanged(String tabId) {  
	                if (tabId.equals("One")) {  
	                      
	                }  
	                if (tabId.equals("Two")) {  
	                    
	                }  
	                if (tabId.equals("Three")) {  
	                     
	                }  
	            }  
	        });  
	          
	    }
}

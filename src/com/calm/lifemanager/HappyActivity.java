package com.calm.lifemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HappyActivity extends Activity {
Button btn_back;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_happy);
		
		/*
		 * ����
		 */
		btn_back = (Button)findViewById(R.id.act_happy_btn_back);
		btn_back.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v) {
				// back to main
				HappyActivity.this.finish();
			}
		});
	}
}

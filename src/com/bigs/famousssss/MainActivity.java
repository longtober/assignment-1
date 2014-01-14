package com.bigs.famousssss;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.textjustify.TextViewEx;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String content = getResources().getString(R.string.content);
		TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textView1);
		txtViewEx.setText(content, true);
	}

//Other method - use orientation detech
//	int orientation = getResources().getConfiguration().orientation;
//	if(orientation == Configuration.ORIENTATION_PORTRAIT){
//
//		txtViewEx.setText(content, true);
//	}else if(orientation == Configuration.ORIENTATION_LANDSCAPE){
//		txtViewEx.setText(content, true);
//	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

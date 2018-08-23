package com.plgf.testhook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends Activity {

	private TextView tv_test;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		tv_test = (TextView) findViewById(R.id.tv_test);
		tv_test.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(TestActivity.this,Test2Activity.class);
				startActivity(intent);
			}
		});
	}
}

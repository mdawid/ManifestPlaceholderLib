package com.example.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		final TextView appId = (TextView)findViewById( R.id.appId );
		appId.setText(MyLibrary.init( this ));
	}
}

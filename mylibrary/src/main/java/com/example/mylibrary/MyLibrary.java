package com.example.mylibrary;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class MyLibrary {
	public static String init( Context context ) {
		try {
			ApplicationInfo ai = context.getPackageManager().getApplicationInfo( context.getPackageName(), PackageManager.GET_META_DATA );
			return (String)ai.metaData.get( "my_app_id" );
		} catch ( PackageManager.NameNotFoundException e ) {
			//TODO: handle exception
		}

		return null;
	}
}

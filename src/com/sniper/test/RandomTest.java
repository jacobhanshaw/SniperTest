package com.sniper.test;

import android.app.Instrumentation;
import android.content.pm.PackageManager;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import com.sniper.*;

public class RandomTest extends ActivityInstrumentationTestCase2<ActivityLogin> {
	
//	private static final int NUM_EVENTS = 1000;
	private static final String packageToTest = "com.sniper.ActivityLogin";
	
	private Button loginButton;
    private View mainLayout;

	
	public RandomTest(){
		super(packageToTest, ActivityLogin.class);
	}

	/**
	 * Trigger the monkey tester
	 */
	@UiThreadTest
	public void testBasic(){
		System.out.println("Log In A: " + loginButton);
		loginButton.performClick();
		
		System.out.println("Log In " + loginButton);
		
		//assertEquals("a", "a");
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		
        ActivityLogin loginActivity = getActivity();
        loginButton = (Button) loginActivity.findViewById(com.sniper.R.id.button1);
        System.out.println("Log In B: " + loginButton);
        mainLayout = (View) loginActivity.findViewById(com.sniper.R.id.layout_root);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	

}

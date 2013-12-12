package com.sniper.test;

import android.app.Instrumentation;
import android.content.pm.PackageManager;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import com.sniper.*;

public class MainTestClass extends ActivityInstrumentationTestCase2<ActivityMain> {
	
//	private static final int NUM_EVENTS = 1000;
	private static final String packageToTest = "com.sniper.ActivityMain";
	
	private Button armButton;
    private View mainLayout;

	
	public MainTestClass(){
		super(packageToTest, ActivityMain.class);
	}

	/**
	 * Trigger the monkey tester
	 */
	@UiThreadTest
	public void testBasic(){
		System.out.println("Log In A: " + armButton);
		armButton.performClick();
		
		System.out.println("Log In " + armButton);
		
		//assertEquals("a", "a");
	}
	
/*	public void testSpinWait(){
		while(true) {
			
		}
	} */
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		
        ActivityMain mainActivity = getActivity();
        armButton = (Button) mainActivity.findViewById(com.sniper.R.id.armory_button);
        System.out.println("Log In B: " + armButton);
        mainLayout = (View) mainActivity.findViewById(com.sniper.R.id.layout_root);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	

}

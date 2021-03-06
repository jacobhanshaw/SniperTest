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
	
	private Button armButton, shootButton, targetsButton;
    private View mainLayout;
    ActivityMain mainActivity;
    
	
	public MainTestClass(){
		super(packageToTest, ActivityMain.class);
	}

	/**
	 * Trigger the monkey tester
	 */
	@UiThreadTest
	public void testBasic(){
		this.assertNotNull("No Progress Dialog", mainActivity.progressDialog);
		armButton.performClick();
		
		
		targetsButton.performClick();
		this.assertTrue("null weapons select", mainActivity.alert != null);
		this.assertTrue("No weapons select", mainActivity.alert.isShowing());
		
		mainActivity.alert.dismiss();
		
		//Button b = (Button)mainActivity.findViewById(com.sniper.R.id.home_button);
		//b.performClick();
		
		//
		
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
		
        mainActivity = getActivity();
        targetsButton = (Button)mainActivity.findViewById(com.sniper.R.id.name_button);
        armButton = (Button) mainActivity.findViewById(com.sniper.R.id.weapon_button);
        
        System.out.println("Log In B: " + armButton);
        mainLayout = (View) mainActivity.findViewById(com.sniper.R.id.layout_root);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	

}

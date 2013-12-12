package com.sniper.test;

import android.app.Instrumentation;
import android.content.pm.PackageManager;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import com.sniper.*;

public class GamesScreenTest extends ActivityInstrumentationTestCase2<ActivityGamesHome> {
	
//	private static final int NUM_EVENTS = 1000;
	private static final String packageToTest = "com.sniper.GamesScreenTest";
	
	private Button armButton, shootButton, targetsButton;
    private View mainLayout;

	
	public GamesScreenTest(){
		super(packageToTest, ActivityGamesHome.class);
	}

	/**
	 * Trigger the monkey tester
	 */
	@UiThreadTest
	public void testBasic(){
		targetsButton.performClick();
		
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
		
        ActivityGamesHome mainActivity = getActivity();
        targetsButton = (Button)mainActivity.findViewById(com.sniper.R.id.game_button);
        
        System.out.println("Log In B: " + armButton);
        mainLayout = (View) mainActivity.findViewById(com.sniper.R.id.layout_root);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	

}

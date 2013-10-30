package com.popag.rhythmrunner.activity;

import com.popag.rythmrunner.R;

import android.app.Activity;
import android.os.Bundle;
/**
 * Activity for user profile settings.
 *
 * @author Csenge Pop
 */
public class ProfileActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
	}
}

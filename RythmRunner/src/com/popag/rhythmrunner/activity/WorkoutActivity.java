package com.popag.rhythmrunner.activity;

import com.popag.rythmrunner.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * Activity to display workout data.
 *
 * @author Csenge Pop
 */
public class WorkoutActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workout);
	}
}

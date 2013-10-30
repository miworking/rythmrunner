package com.popag.rhythmrunner.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.popag.rythmrunner.R;

/**
 * Home activity of the application.
 * 
 * @author Csenge Pop
 */
public class HomeActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		final Context context = (Context) this;

		final Button profileButton = (Button) findViewById(R.id.profileButton);
		final Button activityButton = (Button) findViewById(R.id.activityButton);
		final Button workoutButton = (Button) findViewById(R.id.workoutButton);

		profileButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(final View v) {
				final Intent profileIntent = new Intent(context, ProfileActivity.class);
				startActivity(profileIntent);
			}
		});

		activityButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(final View v) {
				Intent activityIntent = new Intent(context, ActivityActivity.class);
				startActivity(activityIntent);
			}
		});

		workoutButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(final View v) {
				Intent workoutIntent = new Intent(context, WorkoutActivity.class);
				startActivity(workoutIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}

package com.popag.rhythmrunner.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.popag.rythmrunner.R;

/**
 * Activity to display workout data.
 * 
 * @author Csenge Pop
 */
public class WorkoutActivity extends Activity {
	private TextView stepsText;
	private TextView spmText;
	private TextView targetSpmText;
	private TextView kcalText;
	private TextView timeText;
	private TextView distanceText;
	private Button resyncButton;
	private Button spmUpButton;
	private Button spmDownButton;
	private Button stopButton;
	private Button playPauseButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workout);

		Context context = (Context) this;

		findViews();
		addOnclickListeners();
	}

	private void addOnclickListeners() {
		resyncButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(resyncButton);
			}
		});

		spmUpButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(spmUpButton);
			}
		});

		spmDownButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(spmDownButton);
			}
		});

		playPauseButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(playPauseButton);
			}
		});

		stopButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(stopButton);
			}
		});

	}

	private void buttonPushed(Button button) {
		System.out.println("Button: " + button.getText().toString()
				+ " pushed.");
	}

	private void findViews() {
		stepsText = (TextView) findViewById(R.id.stepsText);
		spmText = (TextView) findViewById(R.id.spm);
		targetSpmText = (TextView) findViewById(R.id.target_spm);
		kcalText = (TextView) findViewById(R.id.kcal);
		timeText = (TextView) findViewById(R.id.time);
		distanceText = (TextView) findViewById(R.id.distance);
		resyncButton = (Button) findViewById(R.id.resyncButton);
		spmUpButton = (Button) findViewById(R.id.spmUpButton);
		spmDownButton = (Button) findViewById(R.id.spmDownButton);
		playPauseButton = (Button) findViewById(R.id.playPauseButton);
		stopButton = (Button) findViewById(R.id.stopButton);
	}
}

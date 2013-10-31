package com.popag.rhythmrunner.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
	protected static final CharSequence PAUSE = "Pause";
	protected static final CharSequence RUN = "Run";
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
	private Button runPauseButton;
	private Button musicControllerButton;
	
	private boolean running = false;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workout);

		context = (Context) this;

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

		runPauseButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(runPauseButton);
				if (isRunning()) {
					runPauseButton.setText(PAUSE);
				} else {
					runPauseButton.setText(RUN);
				}
				setRunning(!isRunning());
			}
		});

		stopButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonPushed(stopButton);
			}
		});
		
		musicControllerButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent musicIntent = new Intent(context, MusicControllerActivity.class);
				startActivity(musicIntent);
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
		runPauseButton = (Button) findViewById(R.id.playPauseButton);
		stopButton = (Button) findViewById(R.id.stopButton);
		musicControllerButton = (Button) findViewById(R.id.musicControllerButton);
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
}

package com.popag.rhythmrunner.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Switch;

import com.popag.rythmrunner.R;

/**
 * Activity for music settings.
 *
 * @author Csenge Pop
 */
public class MusicControllerActivity extends Activity {
	
	private Switch musicSwitch;
	private SeekBar volumeSeekBar;
	private Button skipSongButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music_controller);
		
		musicSwitch = (Switch) findViewById(R.id.musicSwitch);
		volumeSeekBar = (SeekBar) findViewById(R.id.volumeSeekBar);
		
		volumeSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Set volume.
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// Ignored.
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Set volume.
				
			}
		});
		
		skipSongButton = (Button) findViewById(R.id.skipSongButton);
		
		skipSongButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	@SuppressLint("NewApi")
	private boolean isMusicOn() {
		return musicSwitch.isChecked();
	}
}

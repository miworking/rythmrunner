package com.popag.rhythmrunner.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;

import com.popag.rhythmrunner.Gender;
import com.popag.rythmrunner.R;

/**
 * Activity for user profile settings.
 * 
 * @author Csenge Pop
 */
public class ProfileActivity extends Activity {

	private Spinner genderSpinner;
	private EditText heightText;
	private EditText weightText;
	private NumberPicker agePicker;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);

		genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
		heightText = (EditText) findViewById(R.id.heightText);
		weightText = (EditText) findViewById(R.id.weightText);
		
		agePicker = (NumberPicker) findViewById(R.id.agePicker);
		agePicker.setMinValue(10);
		agePicker.setMaxValue(100);
	}

	private int getHeight() {
		return Integer.parseInt(heightText.getText().toString());
	}

	private int getWeight() {
		return Integer.parseInt(weightText.getText().toString());
	}

	@SuppressLint("NewApi")
	private int getAge() {
		return agePicker.getValue();
	}

	private Gender getGender() {
		final String genderString = (String) genderSpinner.getSelectedItem();
		return Gender.valueOf(genderString);
	}
}

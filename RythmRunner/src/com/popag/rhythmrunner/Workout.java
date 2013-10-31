package com.popag.rhythmrunner;

import java.sql.Date;

/**
 * POJO class to store workout data.
 * 
 * @author Csenge Pop
 */
public class Workout {

	private Date date;
	private double distance;
	private int minutes;
	private int seconds;

	public Workout(final Date date, final double distance, final int minutes, final int seconds) {
		super();
		this.date = date;
		this.distance = distance;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(final double distance) {
		this.distance = distance;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(final int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(final int seconds) {
		this.seconds = seconds;
	}
}

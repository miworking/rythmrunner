package com.popag.rhythmrunner.activity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.popag.rhythmrunner.Workout;
import com.popag.rythmrunner.R;

/**
 * Activity to display user's former activity and results.
 * 
 * @author Csenge Pop
 */
public class ActivityActivity extends Activity {

	private ListView listView;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity);

		listView = (ListView) findViewById(R.id.activityListView);

		final List<Workout> input = new ArrayList<Workout>();
		input.add(new Workout(new Date(System.currentTimeMillis()), 5.3, 33, 12));
		input.add(new Workout(new Date(System.currentTimeMillis()), 6.7, 45, 30));
		input.add(new Workout(new Date(System.currentTimeMillis()), 3.6, 17, 11));

		final WorkoutAdapter adapter = new WorkoutAdapter(this,
				R.layout.listitem_workout, input);

		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(final AdapterView<?> arg0, final View arg1,
					final int arg2, final long arg3) {
				// TODO Implement.
			}

		});
	}
}

class WorkoutAdapter extends ArrayAdapter<Workout> {

	private final Context context;
	private final List<Workout> workouts;

	public WorkoutAdapter(final Context context, final int textViewResourceId,
			final List<Workout> objects) {
		super(context, textViewResourceId, objects);
		this.context = context;
		this.workouts = objects;
	}

	@Override
	public View getView(final int position, final View convertView,
			final ViewGroup parent) {
		final LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		final View rowView = inflater.inflate(R.layout.listitem_workout,
				parent, false);

		final TextView firstLineText = (TextView) rowView
				.findViewById(R.id.firstLine);
		firstLineText.setText(workouts.get(position).getDate().toLocaleString());
		
		final TextView secondLineText = (TextView) rowView.findViewById(R.id.secondLine);
		secondLineText.setText("Distance: " + workouts.get(position).getDistance() + ".");

		final ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		imageView.setImageResource(R.drawable.running_with_music);

		return rowView;
	}

}

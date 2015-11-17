package com.techedkraft.renaissance;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;

public class SportsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sports);
//		TextView sports_members = (TextView) findViewById(R.id.sports_members);
		TextView sports_head = (TextView) findViewById(R.id.sports_head);
		Typeface setFont = Typeface.createFromAsset(getAssets(), "fonts/mvboli.ttf");
//		sports_members.setTypeface(setFont);
		sports_head.setTypeface(setFont);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.about_developer:
			Toast.makeText(getApplicationContext(), "Developed By Akshay Gangwar", Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.shortcuts_to_committees:
			return true;
			
		case R.id.goto_dance_committee:
			Intent ShortcutToDanceIntent = new Intent(this, DanceActivity.class);
			startActivity(ShortcutToDanceIntent);
			return true;
			
		case R.id.goto_dramatics_committee:
			Intent ShortcutToDramaticsIntent = new Intent(this, DramaticsActivity.class);
			startActivity(ShortcutToDramaticsIntent);
			return true;
			
		case R.id.goto_event_mgmt_committee:
			Intent ShortcutToEventMgmtIntent = new Intent(this, EventMgmtActivity.class);
			startActivity(ShortcutToEventMgmtIntent);
			return true;
			
		case R.id.goto_fine_arts_committee:
			Intent ShortcutToFineArtsIntent = new Intent(this, FineArtsActivity.class);
			startActivity(ShortcutToFineArtsIntent);
			return true;
			
		case R.id.goto_literary_committee:
			Intent ShortcutToLiteraryIntent = new Intent(this, LiteraryActivity.class);
			startActivity(ShortcutToLiteraryIntent);
			return true;
			
		case R.id.goto_music_committee:
			Intent ShortcutToMusicIntent = new Intent(this, MusicActivity.class);
			startActivity(ShortcutToMusicIntent);
			return true;
			
		case R.id.goto_photography_committee:
			Intent ShortcutToPhotographyIntent = new Intent(this, PhotographyActivity.class);
			startActivity(ShortcutToPhotographyIntent);
			return true;
			
		case R.id.goto_quizzing_committee:
			Intent ShortcutToQuizIntent = new Intent(this, QuizActivity.class);
			startActivity(ShortcutToQuizIntent);
			return true;
			
		case R.id.goto_sports_committee:
			Intent ShortcutToSportsIntent = new Intent(this, SportsActivity.class);
			startActivity(ShortcutToSportsIntent);
			return true;
			
		case R.id.goto_technical_committee:
			Intent ShortcutToTechnicalIntent = new Intent(this, TechnicalActivity.class);
			startActivity(ShortcutToTechnicalIntent);
			return true;
			
		case R.id.about_renaissance:
			Intent AboutRenaissanceIntent = new Intent(this, AboutRenaissanceActivity.class);
			startActivity(AboutRenaissanceIntent);
			return true;	

		case R.id.be_the_change:
			Intent BeTheChangeIntent = new Intent(this, JoinRenaissance.class);
			startActivity(BeTheChangeIntent);
			return true;
		default:
			return false;
		}
	}

}

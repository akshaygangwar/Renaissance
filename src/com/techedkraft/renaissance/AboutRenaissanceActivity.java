package com.techedkraft.renaissance;

import com.techedkraft.renaissance.RenaissanceReaderAppActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AboutRenaissanceActivity extends Activity {

	//flag for net connectivity
	boolean isConnectedToNet = false;
	
	//connection detector class
	ConnectionDetector cd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_renaissance);
		TextView about_renaissance = (TextView) findViewById(R.id.about_renaissance);
		TextView trailer_vid = (TextView) findViewById(R.id.trailer_vid);
		TextView progection_trailer_vid = (TextView) findViewById(R.id.progection_trailer_vid);
		Button rssReaderButton = (Button) findViewById(R.id.rssReaderButton);
		Button report_bug_button = (Button) findViewById(R.id.report_bug_button);
		Typeface setFont = Typeface.createFromAsset(getAssets(), "fonts/mvboli.ttf");
		about_renaissance.setTypeface(setFont);
		trailer_vid.setTypeface(setFont);
		progection_trailer_vid.setTypeface(setFont);
		rssReaderButton.setTypeface(setFont);
		report_bug_button.setTypeface(setFont);
		//Instantiate cd
		cd = new ConnectionDetector(getApplicationContext());
	}

	public void openVideo(View v)
	{
		startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://youtu.be/pYBWmQiPUkM")));
	}
	
	public void openProgectionTrailer(View v)
	{
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtu.be/0BVU5CJSpJs")));
	}
	
	public void gotoRSSReader(View v) {
		isConnectedToNet = cd.isConnectingToInternet();
		if(isConnectedToNet) {
			Intent RSSReaderIntent = new Intent(this, RenaissanceReaderAppActivity.class);
			startActivity(RSSReaderIntent);
		}
		//else handle error
		else {
			Toast.makeText(getApplicationContext(), "This action requires an active internet connection.", Toast.LENGTH_SHORT).show();
		}
	}
	
	public void goToBugReport(View v) {
		Intent BugReporterIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/bugreportrenaissance"));
		startActivity(BugReporterIntent);
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
			
		case R.id.be_the_change:
			Intent JoinRenaissanceIntent = new Intent(this, JoinRenaissance.class);
			startActivity(JoinRenaissanceIntent);
			return true;
		
		default:
			return false;
		}
	}

}

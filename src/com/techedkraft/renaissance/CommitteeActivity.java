package com.techedkraft.renaissance;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CommitteeActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_committee);
		//Get references for all the TVs used in activity to set fonts etc using tv.setTypeface(font)
		//Main Head TV
		TextView committee = (TextView) findViewById(R.id.committees);
		
		//Dance Committee TV
		TextView dance = (TextView) findViewById(R.id.dance);
		
		//Dramatics Committee TV
		TextView dramatics = (TextView) findViewById(R.id.dramatics);
		
		//Event Mgmt Committee TV
		TextView event = (TextView) findViewById(R.id.event_mgmt);
		
		//Fine Arts Committee TV
		TextView fineArts = (TextView) findViewById(R.id.fine_arts);
		
		//Literary Committee TV
		TextView literary = (TextView) findViewById(R.id.literary);
		
		//Music Committee TV
		TextView music = (TextView) findViewById(R.id.music);
		
		//Photography Committee TV
		TextView photo = (TextView) findViewById(R.id.photography);
		
		//Quizzing Committee TV
		TextView quiz = (TextView) findViewById(R.id.quiz);
		
		//Sports Committee TV
		TextView sports = (TextView) findViewById(R.id.sports);
		
		//Technical Committee TV
		TextView tech = (TextView) findViewById(R.id.technical);
		
		Typeface setFont = Typeface.createFromAsset(getAssets(), "fonts/mvboli.ttf");
		committee.setTypeface(setFont);
		dance.setTypeface(setFont);
		dramatics.setTypeface(setFont);
		event.setTypeface(setFont);
		fineArts.setTypeface(setFont);
		literary.setTypeface(setFont);
		music.setTypeface(setFont);
		photo.setTypeface(setFont);
		quiz.setTypeface(setFont);
		sports.setTypeface(setFont);
		tech.setTypeface(setFont);
		// Show the Up button in the action bar.
		setupActionBar();
	}
	
	//Handlers for opening committee descriptions
	public void openDanceActivity(View view)
	{
		Intent CommitteeToDanceIntent = new Intent(this, DanceActivity.class);
		startActivity(CommitteeToDanceIntent);
	}
	
	public void openDramaticsActivity(View view)
	{
		Intent CommitteeToDramaticsIntent = new Intent(this, DramaticsActivity.class);
		startActivity(CommitteeToDramaticsIntent);
	}
	
	public void openEventMgmtActivity(View view)
	{
		Intent CommitteeToEventIntent = new Intent(this, EventMgmtActivity.class);
		startActivity(CommitteeToEventIntent);
	}
	
	public void openFineArtsActivity(View view)
	{
		Intent CommitteeToFineArtsIntent = new Intent(this, FineArtsActivity.class);
		startActivity(CommitteeToFineArtsIntent);
	}
	
	public void openLiteraryActivity(View view)
	{
		Intent CommitteeToLiteraryIntent = new Intent(this, LiteraryActivity.class);
		startActivity(CommitteeToLiteraryIntent);
	}
	
	public void openMusicActivity(View view)
	{
		Intent CommitteeToMusicIntent = new Intent(this, MusicActivity.class);
		startActivity(CommitteeToMusicIntent);
	}
	
	public void openPhotographyActivity(View view)
	{
		Intent CommitteeToPhotographyIntent = new Intent(this, PhotographyActivity.class);
		startActivity(CommitteeToPhotographyIntent);
	}
	
	public void openQuizActivity(View view)
	{
		Intent CommitteeToQuizIntent = new Intent(this, QuizActivity.class);
		startActivity(CommitteeToQuizIntent);
	}
	
	public void openSportsActivity(View view)
	{
		Intent CommitteeToSportsIntent = new Intent(this, SportsActivity.class);
		startActivity(CommitteeToSportsIntent);
	}

	public void openTechnicalActivity(View view)
	{
		Intent CommitteeToTechnicalIntent = new Intent(this, TechnicalActivity.class);
		startActivity(CommitteeToTechnicalIntent);
	}
	
	
	/*//SETTING FONT TO FORTE
	public void setFontToForte(View v)
	{
		//Get references for all the TVs used in activity to set fonts etc using tv.setTypeface(font)
		//Main Head TV
		TextView committee = (TextView) findViewById(R.id.committees);
		//Dance Committee TV
		TextView dance = (TextView) findViewById(R.id.dance);
		
		//Dramatics Committee TV
		TextView dramatics = (TextView) findViewById(R.id.dramatics);
		
		//Event Mgmt Committee TV
		TextView event = (TextView) findViewById(R.id.event_mgmt);
		
		//Fine Arts Committee TV
		TextView fineArts = (TextView) findViewById(R.id.fine_arts);
		
		//Literary Committee TV
		TextView literary = (TextView) findViewById(R.id.literary);
		
		//Music Committee TV
		TextView music = (TextView) findViewById(R.id.music);
		
		//Photography Committee TV
		TextView photo = (TextView) findViewById(R.id.photography);
		
		//Quizzing Committee TV
		TextView quiz = (TextView) findViewById(R.id.quiz);
		
		//Sports Committee TV
		TextView sports = (TextView) findViewById(R.id.sports);
		
		//Technical Committee TV
		TextView tech = (TextView) findViewById(R.id.technical);
		//Typeface font = Typeface.createFromAsset(getAssets(), "fonts/FREESCPT.TTF");
		//committee.setTypeface(font);
		Typeface forte = Typeface.createFromAsset(getAssets(), "fonts/FORTE.TTF");
		committee.setTypeface(forte);
		dance.setTypeface(forte);
		dramatics.setTypeface(forte);
		event.setTypeface(forte);
		fineArts.setTypeface(forte);
		literary.setTypeface(forte);
		music.setTypeface(forte);
		photo.setTypeface(forte);
		quiz.setTypeface(forte);
		sports.setTypeface(forte);
		tech.setTypeface(forte);
	}
	
	
	//SETTING FONT TO FREESCPT
	public void setFontToFreescpt(View v)
	{
		//Get references for all the TVs used in activity to set fonts etc using tv.setTypeface(font)
		//Main Head TV
		TextView committee = (TextView) findViewById(R.id.committees);
		//Dance Committee TV
		TextView dance = (TextView) findViewById(R.id.dance);
		
		//Dramatics Committee TV
		TextView dramatics = (TextView) findViewById(R.id.dramatics);
		
		//Event Mgmt Committee TV
		TextView event = (TextView) findViewById(R.id.event_mgmt);
		
		//Fine Arts Committee TV
		TextView fineArts = (TextView) findViewById(R.id.fine_arts);
		
		//Literary Committee TV
		TextView literary = (TextView) findViewById(R.id.literary);
		
		//Music Committee TV
		TextView music = (TextView) findViewById(R.id.music);
		
		//Photography Committee TV
		TextView photo = (TextView) findViewById(R.id.photography);
		
		//Quizzing Committee TV
		TextView quiz = (TextView) findViewById(R.id.quiz);
		
		//Sports Committee TV
		TextView sports = (TextView) findViewById(R.id.sports);
		
		//Technical Committee TV
		TextView tech = (TextView) findViewById(R.id.technical);
		//Typeface font = Typeface.createFromAsset(getAssets(), "fonts/FREESCPT.TTF");
		//committee.setTypeface(font);
		Typeface freescpt = Typeface.createFromAsset(getAssets(), "fonts/FREESCPT.TTF");
		committee.setTypeface(freescpt);
		committee.setTextSize(30);
		dance.setTypeface(freescpt);
		dramatics.setTypeface(freescpt);
		event.setTypeface(freescpt);
		fineArts.setTypeface(freescpt);
		literary.setTypeface(freescpt);
		music.setTypeface(freescpt);
		photo.setTypeface(freescpt);
		quiz.setTypeface(freescpt);
		sports.setTypeface(freescpt);
		tech.setTypeface(freescpt);
	}
	
	
	//SETTING FONT TO VINERITC
	public void setFontToVineritc(View v)
	{
		//Get references for all the TVs used in activity to set fonts etc using tv.setTypeface(font)
				//Main Head TV
				TextView committee = (TextView) findViewById(R.id.committees);
				//Dance Committee TV
				TextView dance = (TextView) findViewById(R.id.dance);
				
				//Dramatics Committee TV
				TextView dramatics = (TextView) findViewById(R.id.dramatics);
				
				//Event Mgmt Committee TV
				TextView event = (TextView) findViewById(R.id.event_mgmt);
				
				//Fine Arts Committee TV
				TextView fineArts = (TextView) findViewById(R.id.fine_arts);
				
				//Literary Committee TV
				TextView literary = (TextView) findViewById(R.id.literary);
				
				//Music Committee TV
				TextView music = (TextView) findViewById(R.id.music);
				
				//Photography Committee TV
				TextView photo = (TextView) findViewById(R.id.photography);
				
				//Quizzing Committee TV
				TextView quiz = (TextView) findViewById(R.id.quiz);
				
				//Sports Committee TV
				TextView sports = (TextView) findViewById(R.id.sports);
				
				//Technical Committee TV
				TextView tech = (TextView) findViewById(R.id.technical);
				//Typeface font = Typeface.createFromAsset(getAssets(), "fonts/FREESCPT.TTF");
				//committee.setTypeface(font);
				//Typeface vineritc = Typeface.createFromAsset(getAssets(), "fonts/handmeds.ttf");
				//Typeface vineritc = Typeface.createFromAsset(getAssets(), "fonts/VINERITC.TTF");
				Typeface vineritc = Typeface.createFromAsset(getAssets(), "fonts/mvboli.ttf");
				committee.setTypeface(vineritc);
				dance.setTypeface(vineritc);
				dramatics.setTypeface(vineritc);
				event.setTypeface(vineritc);
				fineArts.setTypeface(vineritc);
				literary.setTypeface(vineritc);
				music.setTypeface(vineritc);
				photo.setTypeface(vineritc);
				quiz.setTypeface(vineritc);
				sports.setTypeface(vineritc);
				tech.setTypeface(vineritc);
	}*/
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

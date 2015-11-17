package com.techedkraft.renaissance;

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

public class JoinRenaissance extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_join_renaissance);
		
		TextView join_renaissance_intro = (TextView) findViewById(R.id.join_renaissance_intro);
		Button join_renaissance_button = (Button) findViewById(R.id.join_renaissance_button);
		Button volunteer_proGECtion_button = (Button) findViewById(R.id.volunteer_proGECtion_button);
		Button proGECtion_solo_participation_button = (Button) findViewById(R.id.proGECtion_solo_participation_button);
		Button proGECtion_group_participation_button = (Button) findViewById(R.id.proGECtion_group_participation_button);
		Typeface setFont = Typeface.createFromAsset(getAssets(), "fonts/mvboli.ttf");
		join_renaissance_button.setTypeface(setFont);
		join_renaissance_intro.setTypeface(setFont);
		volunteer_proGECtion_button.setTypeface(setFont);
		proGECtion_solo_participation_button.setTypeface(setFont);
		proGECtion_group_participation_button.setTypeface(setFont);
		
	}
	
	public void gotoForm(View v)
	{
		Intent FormOpenerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/voldoc"));
		startActivity(FormOpenerIntent);
	}
	
	public void goToVolFest(View v) {
		Intent VolFestFormOpenerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/volfest"));
		startActivity(VolFestFormOpenerIntent);
	}
	
	public void goToFestSolo(View v) {
		Intent FestSoloOpenerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/festsolo"));
		startActivity(FestSoloOpenerIntent);
	}
	
	public void goToFestGroup (View v) {
		Intent FestGroupOpenerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/festgroup"));
		startActivity(FestGroupOpenerIntent);
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
		
		default:
			return false;
		}
	}

}

package com.techedkraft.renaissance;


import java.util.List;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.techedkraft.renaissance.R;
import com.techedkraft.renaissance.RssItem;
import com.techedkraft.renaissance.ListListener;
import com.techedkraft.renaissance.RssReader;

public class RenaissanceReaderAppActivity extends Activity {
	private RenaissanceReaderAppActivity local;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		local = this;
		
		GetRSSDataTask task = new GetRSSDataTask();
		
		// Start download RSS task
		task.execute("http://www.xda-developers.com/feed/");
	}
	
	public void getRefresh(View view) {
		GetRSSDataTask task = new GetRSSDataTask();
		task.execute("http://techedkraft.wordpress.com/feed/");
	}

	private class GetRSSDataTask extends AsyncTask<String, Void, List<RssItem> > {
		@Override
		protected List<RssItem> doInBackground(String... urls) {
			
			
			try {
				// Create RSS reader
				RssReader rssReader = new RssReader(urls[0]);
			
				// Parse RSS, get items
				return rssReader.getItems();
			
			} catch (Exception e) {
				Log.e("ITCRssReader", e.getMessage());
			}
			
			return null;
		}
		
		@Override
		protected void onPostExecute(List<RssItem> result) {
			if(result == null) {
				Toast.makeText(getApplicationContext(), "No feeds found. . . Please report bug to a member of the Technical Society.", Toast.LENGTH_LONG).show();
			}
			else {
			// Get a ListView from main view
			ListView renaissanceItems = (ListView) findViewById(R.id.listMainView);
						
			// Create a list adapter
			ArrayAdapter<RssItem> adapter = new ArrayAdapter<RssItem>(local,android.R.layout.simple_expandable_list_item_1, result);
			// Set list adapter for the ListView
			renaissanceItems.setAdapter(adapter);
						
			// Set list view item click listener
			renaissanceItems.setOnItemClickListener(new ListListener(result, local));
			}
		}
	}
	
}

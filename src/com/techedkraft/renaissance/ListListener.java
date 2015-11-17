package com.techedkraft.renaissance;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ListListener implements OnItemClickListener{
	
	// List item's reference
		List<RssItem> listItems;
		// Calling activity reference
		Activity activity;
		
		public ListListener(List<RssItem> aListItems, Activity anActivity) {
			listItems = aListItems;
			activity  = anActivity;
		}
		
		/**
		 * Start a browser with url from the rss item.
		 */
		public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(listItems.get(pos).getLink()));
			/*
			 * Trying out code to view rss feed in WebView within the application for seamless experience...
			 * @author akshay_gangwar
			 */
			
			//obtained_link = listItems.get(pos).getLink();
			
			/*
			 * End of attempted code for viewing rss feed in WebView within the application for seamless experience...
			 */
			activity.startActivity(i);
			
		}
	
}

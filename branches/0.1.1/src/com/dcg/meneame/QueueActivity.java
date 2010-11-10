package com.dcg.meneame;

import android.os.Bundle;

/**
 * Where we show the queue of acticles
 * @author Moritz Wundke (b.thax.dcg@gmail.com)
 */
public class QueueActivity extends FeedActivity {
	
	public QueueActivity() {
		super();
		
		// Set feed
		mFeedURL = "http://feeds.feedburner.com/MeneameEnCola?format=xml";
	}
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Register our self
		if ( getTabActivityTag().length() > 0 )
		{
			mApp.addTabActivity( getTabActivityTag(), this);
		}
	}
	
	/**
	 * Returns the tag this activity will hold in the main TabWidget
	 * @return String - TabTag
	 */
	public String getTabActivityTag() {
		return "in_que_tab";
	}
	
	/**
	 * String id used for the tab indicator
	 * @return
	 */
	public int getIndicatorStringID() {
		return R.string.main_tab_queue;
	}
	
	/**
	 * Returns the tag this activity will hold in the main TabWidget
	 * @return String - TabTag
	 */
	public static String static_getTabActivityTag() {
		return "in_que_tab";
	}
	
	/**
	 * String id used for the tab indicator
	 * @return
	 */
	public static int static_getIndicatorStringID() {
		return R.string.main_tab_queue;
	}
}

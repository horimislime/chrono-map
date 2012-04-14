package jp.horimislime.example.chronoscope.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point class
 */
public class ChronoMap implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new MapComponent());
	}
}

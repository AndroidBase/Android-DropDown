package com.szugyi.dropdown;

import android.app.Activity;
import android.os.Bundle;
import com.szugyi.dropdown.R;
import com.szugyi.dropdown.view.DropDown;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DropDown citiesDropDown = (DropDown)findViewById(R.id.main_cities_dropDown);
		citiesDropDown.setItems(R.array.cities);
	}
}

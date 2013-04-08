package com.szugyi.dropdown;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.szugyi.dropdown.R;
import com.szugyi.dropdown.view.DropDown;

public class MainActivity extends Activity implements OnClickListener {
	DropDown countriesDropDown;
	DropDown citiesDropDown;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		countriesDropDown = (DropDown) findViewById(R.id.main_countries_dropDown);
		
		citiesDropDown = (DropDown) findViewById(R.id.main_cities_dropDown);
		// Set the items of the dropdown
		citiesDropDown.setItems(R.array.cities);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.main_show_values_button:
				String toastMessage = "Choosen country: ";
				// Get the string value of the selected item
				// Null will be returned, if an item has not yet been selected
				String countryString = countriesDropDown.getSelectedItemString();
				toastMessage += countryString == null ? getResources().getString(R.string.none) : countryString;
				
				toastMessage += "\nChoosen city: ";
				// Get the selected item
				Object city = citiesDropDown.getSelectedItem();
				// If an item was selected, get its string value
				toastMessage += city == null ? getResources().getString(R.string.none) : city.toString();
				
				// Show the selected values in a Toast
				Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
				break;

			default:
				break;
		}
	}
}

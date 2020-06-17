package com.pratap.dp.adapter;

public class WeatherAdapter {

	public int findTempreture(int zipcode) {

		String city = null;

		if (zipcode == 560090) {
			city = "Bangalore";
		}
		WeatherFinder finder = new WeatherFinderImpl();
		return finder.find(city);

	}
}

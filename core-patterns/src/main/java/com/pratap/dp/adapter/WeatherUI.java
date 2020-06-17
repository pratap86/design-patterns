package com.pratap.dp.adapter;

public class WeatherUI {

	WeatherAdapter adapter = null;
	
	public void showTempreture(int zipcode) {
		adapter = new WeatherAdapter();
		int tempreture = adapter.findTempreture(zipcode);
		
		System.out.println(zipcode+" tempreture is "+tempreture);
	}
}

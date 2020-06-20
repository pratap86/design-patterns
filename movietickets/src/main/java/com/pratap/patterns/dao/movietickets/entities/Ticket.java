package com.pratap.patterns.dao.movietickets.entities;

public class Ticket {

	private int id;
	private String movie;
	private String screen;
	private String seat;
	
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public int getId() {
		return id;
	}
	
	
}

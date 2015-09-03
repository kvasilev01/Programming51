package com.hackbulgaria.programming51.week4;

public class MusicOrganiser {
	
	Vector<Song> songs = new Vector<Song>();
	private Song[] data;
	private int size = 0;
	private int capacity = 10;
    
	public MusicOrganiser(){
		data = (Song[]) new Object[capacity];		
	}
	
	public void addSong(Song s){
		if(size == capacity);
		data[size] = s;
		size++;
}	

	public int getCount(){
		
	}
}


package com.hackbulgaria.programming51.week4;

public class SongMain {

	public static void main(String[] args) {
	Song s = new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP");
System.out.println(s.getAlbum());
	
	
	MusicOrganiser mo = new MusicOrganiser();
	mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
	System.out.println(mo);
}
}
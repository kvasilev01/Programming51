package com.hackbulgaria.programming51.week6;


	import java.util.Vector;

	public class Landscape {
	    Vector<Tile> landscape;

	    public Landscape(){
	        landscape = new Vector<Tile>();
	    }

	    public void addTile(Tile t) {
	        landscape.addElement(t);
	    }

	    public String renderAll() {
	        String result = " ";
	        for (Tile tile : landscape) {
	            result += tile.render();
	        }
	        return result;
	    }
	}
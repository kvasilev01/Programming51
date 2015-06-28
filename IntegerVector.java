package com.hackbulgaria.programming51.week3;

public class IntegerVector {
	private int[] data;
	private int capacity;
	private int size;
	
	public IntegerVector(){
		capacity = 10;
		size = 0;
		data = new int[capacity * 2 + 1];
	}
		
		public void add(int v){
			if(size == capacity);
			data[size] = v;
			size++;
		}
		
	public String toString(){
		String str = "";
		for(int v = 0; v < size; v++){
		str += data[v] + " ";
		}
		return str;
	}
	
	private void resize(){
		int[]temp = new int[capacity];
		for(int v = 0; v < size; v ++){
			temp [v] = data[v];			
		}			
		data = temp;
	}
	public int size(){	
		return size;
		}
	
	public int sum (){
		int sum = 0;
		for(int i = 0; i < size; i++){
		sum += size();	
		}
		
		return  sum;
	}
	public int get(int index){
		if(index > 0 && index < size);
			return data[index];
	}   
	
	public void addAll(int [] n){
		int [] b = new int[10];
	    for (int i = 0; i < 10; i++) {
	      data[i] = b[i];
	    }	
		data = b;
	}
	public void insert(int index, int e ){
		if(index >= 0 && index < size){
			data[index] = e;	
		}
	}
	public void remove(int index){
		for(int i = index; i < size; i++){
			data[i] = data[i + 1];
			size--;
		}
		
	}			
	}


package com.hackbulgaria.programming51.week3;

public class IntegerVectorStatic {
	
	public static String toString(IntegerVector v) {
		String data = "";
		if(v.size() > 0){
			for(int i = 0; i < v.size() - 1; i++){
				data += v.get(i) + ", ";
			}
			data += v.get(v.size() - 1);		
		}
		return data;
	}
	
	public static void sort(IntegerVector v){
		for(int i = 0; i < v.size(); i++){
			int temp = i;
			for(int j = i; j< v.size();j++){
				if(v.get(j)< v.get(temp)){
					temp = j;
				}
				v.replace(i,temp);
			}
				
		}	
	}
	public static IntegerVector reverse(IntegerVector v) {
		IntegerVector data = new IntegerVector();
		for(int i = 0; i < v.size();i++){
			data.insert(0,v.get(i));
		}
		return data;
	}
}	 




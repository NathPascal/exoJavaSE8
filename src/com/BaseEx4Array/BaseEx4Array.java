// Exo 4.1 

package com.BaseEx4Array;

public class BaseEx4Array {
	
public static void main(String[] args) {
		
		
		double [] notes = { 5.5, 10, 12.5, 15, 18 };
	
		System.out.println ("min: " + getMin(notes));
		System.out.println ("max: " + getMax(notes));
		System.out.println ("moy: " + getAverage(notes));

	}
	
	public static double getMin (double[] notes) {
		double min = Double.MAX_VALUE; // compare chaque élément avec la plus grande valeur pour trouver le plus petit
		for (double i: notes){
			min = Math.min(min, i);
		}
		return min;
	}
	
	public static double getMax (double[] notes) {
		double max = Double.MIN_VALUE; 
		for (double i : notes) {
			max = Math.max(max, i);
		}
		return max;
	}
	
	public static double getAverage (double[] notes) {
		double average = 0;
		for (int i = 0 ; i < notes.length ; i++ ) {
			average += notes[i];
		}
		return average/notes.length;
	}
	
}





package com.BaseEx4Array;
// exo 4.3

import java.util.Scanner;
import java.util.HashMap;

public class Student {

	public static void main(String[] args) {
		
		HashMap<String, double[]> results = new HashMap<>(); // string = clé et double = valeur
		results.put("Bob Dupont", new double[]{6 , 5.5 , 10});
		results.put("franklin William", new double[]{12, 14.5 , 16});
		results.put("joe Salvator", new double[]{8 , 15 , 13});	
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Veuillez saisir le prénom et le nom de l'élève: ");
		String result = scan.nextLine();
		
		if(results.containsKey(result)) { // ".containsKey" pour vérifier si une clé existe ou pas = boolean
			double[] notes = results.get(result); //".get" renvoie la valeur associée à la clé
			System.out.print(result + " : ");
			
			for (double note: notes ) {
                System.out.print(note + ". ");
            }
			System.out.println();
			System.out.println("Moyenne de: " + getAverage(notes));}
		else {
			System.out.println("non présent dans la liste");
		}
		
		 scan.close();
		 
		}	

	public static double getAverage (double[] notes) {
		double average = 0;
		for (int i = 0 ; i < notes.length ; i++ ) {
			average += notes[i];
		}
		return average/notes.length;
	}
}


package com.BaseEx4Array;
/** Exo 4.4 : Écrire enfin un programme qui va trier dans l’ordre décroissant la liste des prénoms de 
* votre promo, puis dans l’ordre croissant.*/

import java.util.ArrayList;
import java.util.Collections;

public class Tri {

	public static void main(String[] args) {
		// 1- créer la liste des prénoms
		ArrayList<String>name = new ArrayList<>();
		name.add("Bob");
		name.add("Franklin");
		name.add("Roger");
		name.add("Joe");
		name.add("Paul");
		
		System.out.println(name);
		
		// 2- trier la liste des prénoms dans l'ordre décroissant
		Collections.sort(name, Collections.reverseOrder());
		System.out.println("ordre décroissant: " + name);
		
		// 3 - trier la liste des prénoms dans l'ordre croissant
		Collections.sort(name);
		System.out.println("ordre croissant: " + name);

	}

}

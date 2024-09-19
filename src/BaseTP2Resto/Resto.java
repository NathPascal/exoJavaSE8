package BaseTP2Resto;

import java.util.Scanner;

public class Resto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Enregistrer les menus
		
		int menus = 0;
		String [][] menu = {
				{"entrée","salade","soupe", "quiche", "aucune"}, 
				{"plat","poulet","boeuf","poisson","végétarien","vegan","aucun"},
				{"accompagnement","riz","pates","frites","légumes","aucun"},
				{"boisson","eau plate","eau gazeuse","soda","vin","aucun"},
				{"dessert","tarte maison","mousse au chocolat","tiramisu","aucun"}
				}; 
 
		
		// 2 -Ecrire une phrase qui demande combien de menus
		
		System.out.println("\nCombien de menus voulez-vous?");
		
		// 3 -Lecture de la réponse
		menus = scan.nextInt();
		
		// 4 - Demander le choix de chaques parties
		
		for(int i = 0;i<menus;i++) {
			System.out.println();
			
		};
		// 5 - Lecture des réponses
		
		
		// 6 - On affiche les choix
		
		// 7 - Fin
	}
/*if (Menus <= 0) {
	System.out.println("Stop");**/
}

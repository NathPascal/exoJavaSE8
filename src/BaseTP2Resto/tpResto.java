package BaseTP2Resto;

import java.util.Scanner;

public class tpResto {

	public static void main(String[] args) {
		//Demander combien de menus l'utilisateur souhaite
		Scanner scan = new Scanner(System.in);
		System.out.println("Combien de menus souhaitez-vous?");
		
		//Lecture de la réponse
		int nbMenu = scan.nextInt();
		
		//liste des choix de menus 	
		String menu [][] = {
				{"entrée","1 - salade","2 - soupe","3 - quiche","4 - aucune"},
				{"plats","1 - poulet","2 - boeuf","3 - poisson","4 - végétarien","5 - vegan","6 - aucun"},
				{"accompagnements","1 - riz","2 - pates","3 - frites","4 - légumes","5 - aucun"},
				{"boissons","1 - eau plate","2 - eau gazeuse","3 - soda","4 - vin","5 - aucune"},
				{"desserts","1 - tarte maison","2 - mousse au chocolat","3 - tiramisu","4 - aucun"}
		};
		
		String[][] order = new String[nbMenu][menu.length];
		//Demander ce qu'il souhaite pour chaque menu
		
		for (int i = 0; i < nbMenu; i++) {
			System.out.println("commande numéro " + (i+1));
			for (int j = 0; j < menu.length; j++) {
				System.out.println("Quel "+ menu[j][0] + " souhaitez-vous choisir?");
				for (int k = 1; k < menu[j].length; k++) {
					System.out.println(menu[j][k]);
				}
			
		//lecture de la réponse
		int choice = scan.nextInt();
		order[i][j] = menu[j][choice];
		
			}
		}
			
		//afficher le résumé de la commande
		for (int i = 0; i < nbMenu; i++){
			System.out.println("résumé de la commande " +(i+1)+": ");
			for (int j =0; j < menu.length; j++){
				System.out.println(order[i][j]);
				}
			}
		
			scan.close();
	}
}
	


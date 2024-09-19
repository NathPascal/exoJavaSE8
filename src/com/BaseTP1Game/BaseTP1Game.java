package com.BaseTP1Game;
import java.util.Scanner;


public class BaseTP1Game {
	 			
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		while (true) {
		System.out.println ("Voulez-vous jouer Oui/Non?");
		
		String yes = scan.nextLine();
		Boolean game = yes.equalsIgnoreCase ("Oui");
		
		if (!game) {
			System.out.println("Ok, Bye!");
		}
		
		int randomNb = 1 + (int)(Math.random() * 101);
		int nbCoups = 0;
		
		while (game) {
		
		System.out.println ("Saissizez un chiffre entre 1 et 100: ");
			
		int i = scan.nextInt();
		nbCoups ++;
			
		if (i > randomNb) {
			System.out.println("C'est plus petit");
		}
		else if (i < randomNb) {
			System.out.println("C'est plus grand");}
		
		else {
			System.out.println ("Bravo! Vous avez trouvé en " + nbCoups + " coups!" );
			 scan.nextLine();
			 System.out.println("Voulez-vous rejouer Oui/Non?");
			 String rejouer = scan.nextLine();
			 game = rejouer.equalsIgnoreCase("Oui");
			 if (game) {
				 randomNb = 1 + (int)(Math.random() * 101);
				 nbCoups = 0;}
			 else {
				 System.out.println("Ok, Bye!");
			 }
			}
		
		}}		
		
	}
}



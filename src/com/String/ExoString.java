package com.String;

import java.util.Scanner;

public class ExoString {

	public static void main(java.lang.String[] args) {
		// 5.1 : Trouver plusieurs moyens de concaténer 2 chaînes de type String.
		
		String Stg1 = "Bonjour";
		String Stg2 = "Aurevoir";
		Stg1 += " " + Stg2; 
		System.out.println(Stg1);
		
		Stg1 = Stg1.concat(". ");
		System.out.println(Stg1);
		
		Stg1 = new String("Bye");
		System.out.println(Stg1);
		
		/**5.2 : Dans une chaîne(phrase) donnée, trouver s'il existe un mot, si oui, afficher trouvé.
		ex : "il fait beau aujourd'hui" → mot recherché "Beau" donc trouvé !*/
		
		//1- Créer la phrase: "il fait beau aujourd'hui"
		String stg = "il fait beau aujourd'hui.";
		//2- Demander quel mot l'utilisateur recherche
		Scanner scan = new Scanner(System.in);
		System.out.println("Quel mot recherchez-vous? ");
		//3- Lecture du mot
		String word = scan.next();
		//4-si le mot existe, écrire "trouvé"
		if (stg.contains(word)) System.out.println("trouvé!");
		//5 si non "Ce mot n'est pas dans la phrase."
		else System.out.println("Ce mot n'est pas dans la phrase");
		
		/**5.3  Reprendre exercice précédent et remplacer le mot si trouvé par un autre saisi par 
		l'utilisateur. ex : "il fait beau aujourd'hui" donne "il fait chaud aujourd'hui"*/

		//1 - Demander à l'utilisateur par quel mot il veut remplacer le mot trouvé
		System.out.println("Par quel mot voulez-vous remplacer le mot trouvé? ");
		//2 - Lecture du mot
		String replace = scan.next();
		//3 - Remplacer le mot par celui trouvé 
		stg = stg.replace(word, replace);
		System.out.println(stg);
		
		scan.close();
		
	}

}
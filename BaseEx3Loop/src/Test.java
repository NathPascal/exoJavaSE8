import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Exercice 3.1 et 3.2
 * Programme lit un nombre entier et indique s'il est positif, negatif ou s'il vaut zéro, pair ou impair
 * Dans cette variante, il peut lire directement les arguments en ligne de commande et répéter les tests précédents 
 * pour chaque argument + gère les erreurs de saisies sur 2 versions
 * 
 * @author El babili - 2024
 * 
*/

public class Test {		
	  public static void main(String[] args) {	 	//String [] args = { "123f" "d" "-9" "+" "0" "123" "10" "-2" "-" };
		  if(args.length > 0) { 
			  for(int i=0 ; i<args.length ; i++) { 
				  int value;
				  String str = args[i];
				  
				  // option 1					
				  Scanner scan = new Scanner(args[i]);  
				  if(scan.hasNextInt()) {
					  value = scan.nextInt(); 
					  System.out.println(doJobs(value));
				  } else System.out.println(str + " n'est pas un entier"); 
				  scan.close();					 					
				  
				  // option 2
//				  boolean isNum = isDigit(str);				  
//				  if(isNum) { 	
//						value = Integer.valueOf(str); 
//						String res = doJobs(value); 
//						System.out.println(res); 
//					} 
//				  else System.out.println(str + " n'est pas un entier");
				  
				//boolean isNum = StringUtils.isNumeric(str);		//option 3 Attention petit pb
				  System.out.println();
			  } 
		  } 
		  else System.out.println("vous n'avez saisi aucun paramètre !"); 
	}

	//méthode qui teste si un nombre est positif, negatif ou egal à 0, pair ou impair, puis renvoi le résultat sous forme de chaine	
	public static String doJobs(int value) {
		String result = value + " ";
		if(value > 0)	result += "positif ";
		else if(value < 0)	result += "négatif ";
		else result += "== 0 ";
		
		if(value % 2 == 0)	result += "et pair";
		else result += "et impair";
		return result;
	}
	
	//méthode qui verifie si une chaine contient que des valeurs numeriques ou pas
	private static boolean isDigit(String st) {		//"123"		{'1','2','3'}
		for (char c : st.toCharArray()) {
			if (c == '-') continue; 
	        if (Character.isDigit(c) == false) return false;
	    }
		if(st.length() == 1 && st.equals("-")) return false;
	    return true;
	}
}
package com.String;

public class Palindrome {
	// 5.4 : Écrire un programme qui dit si une chaîne est un palindrome, ex : akka, ottO
			// 5.5 : Tester votre programme avec : "Elu par cette crapule" (c'est un palindrome), que faire ?
			//1 - Créer les conditions du palindrome
	public static boolean isPalindrome(String word) {
		word = word.replaceAll(" ", "").toLowerCase();
		 StringBuffer stringBuffer = new StringBuffer(word);
	     return stringBuffer.reverse().toString().equalsIgnoreCase(word);	
			}
	public static void main(String[] args) {
		
		//2 - Ecrire les mots qui seront testés
		String[] words = {"ELU par cette crapule","ottO","akka", "toto" };
		// 3 - Tester les différents mots
		for(String word : words) {
		// 4 - Si le mot est un palindrome écrire que c'est un palindrome
			if(isPalindrome(word)) System.out.println(word + " est un palindrome");
		// 5 - Si non, ce n'est pas un palindrome
			else System.out.println(word + " n'est pas un palindrome");
	}
	}		
}

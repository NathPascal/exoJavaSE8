package com.BaseEx4Array;

// exo 4.2

import java.util.Scanner;

public class Professor {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien d'élèves voulez-vous saisir ? ");
        int students = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < students; i++) { // "for" parce qu'on connait le nombre de fois
            System.out.print("Nom: ");
            String lastName = scanner.nextLine();
            System.out.print("Prénom: ");
            String firstName = scanner.nextLine();

            System.out.print("Combien de notes voulez-vous saisir? ");
            int numbers = scanner.nextInt();
            double somme = 0;

            for (int j = 0; j < numbers; j++) {
                System.out.print("Note " + (j + 1) + " (Attention : écrire 10,5 et pas 1.5): "); // "note" + (j+1) -> permet de savoir quelle note on saisit
                double note = scanner.nextDouble();
                somme += note;
            }
            scanner.nextLine(); 

            double average = somme / numbers;
            System.out.println(lastName + ", " + firstName + ": " + average + " de moyenne.");
        }

        scanner.close();
    }
}

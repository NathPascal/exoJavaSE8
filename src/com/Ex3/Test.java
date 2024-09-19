package com.Ex3;
import java.util.Scanner;


public class Test {

	public static void main(String[] args ) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Saisissez un nombre: ");
		
		while (true) {
			
			if (scan.hasNextInt()) {
				
				int nombre = scan.nextInt();
				
					if (nombre > 0) {
						if (nombre % 2 == 0) 
				System.out.println(nombre+" est positif et pair");
						else {
				System.out.println(nombre+" est positif et impair");}
		}
					else if (nombre < 0) {
						if (nombre % 2 == 0) {
				System.out.println(nombre+" est négatif et pair");}
						else {
				System.out.println(nombre+" est négatif et impair");}
		}
					else {
			System.out.println(nombre+" est neutre");
		}}
			
			else {
	System.out.println("Ceci n'est pas un nombre entier ");
	scan.next();}}
		
	}}
	

		
	

	


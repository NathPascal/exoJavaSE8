package com.BaseEx4Array;
// exo 4.5 : tri à bulles : comparer et échanger des nombres entiers dans un tableau pour les trier dans l'ordre croissant
public class Unknown {

	public static void main(String[] args) {
		
				int table[] = { -5, 2, -8, 31, 15, 4 };
				displayTab(table);
				fonction(table);
				displayTab(table);
			}
			
			static void fonction(int[] tab) {
				int tmp = 0;
				for (int i = 0; i < tab.length; i++) {
					for (int j = 1; j < (tab.length - i); j++) {
						if (tab[j - 1] > tab[j]) {					
							tmp = tab[j - 1];
							tab[j - 1] = tab[j];
							tab[j] = tmp;
						}
					}
				}
			}

			static void displayTab(int[] tab) {
				for (int i = 0; i < tab.length; i++) {
					System.out.print(tab[i] + " ");
				}
				System.out.println();
			}
	}

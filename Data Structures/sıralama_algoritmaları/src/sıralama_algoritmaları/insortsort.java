package sıralama_algoritmaları;

import java.util.Scanner;

public class insortsort {
	private static void insortsort(int dizi[], int n ) {
		for (int i = 1 ; i < n ; i++) {
			for (int j = i ; j > 0 ; j--) {
				if ( dizi[j] < dizi[j+1]) {
					int gecici = dizi[j];
					dizi[j] = dizi[j-1];
					dizi[j-1] = gecici;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int dizi[] = new int[n];
		for (int i = 0 ; i < n; i++) {
			System.out.println("dizi kaç elemanlı olsun");dizi[i] = scanner.nextInt();
		}
		insortsort(dizi,n);
		for (int i = 0 ; i < n ; i++) {
			System.out.print(dizi[i]+ " ");
		}
	}

}

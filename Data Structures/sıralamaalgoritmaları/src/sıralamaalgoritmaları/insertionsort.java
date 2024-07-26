package sıralamaalgoritmaları;

public class insertionsort {	
	public static void insertionSort(int[] dizi) {
		
		for(int i=1; i<dizi.length; i++) {
			int key=dizi[i];
			int j=i-1;
			
			while(j>=0 && dizi[j]>key) {
				dizi[j+1]=dizi[j];
				j--;
			}
			dizi[j+1]=key;
		}
		for(int i=0; i<dizi.length;i++) {
			System.out.print(dizi[i] +" , ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] dizi= {10, 2, 8, 3, 9, 4, 1, -1};
		insertionSort(dizi);
	}	

}

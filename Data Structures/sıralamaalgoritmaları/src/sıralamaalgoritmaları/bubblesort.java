package sıralamaalgoritmaları;

public class bubblesort {
	public static void bublesort(int[] dizi) {
		int temp;
		for(int i=0;i<dizi.length;i++) {
			for(int j=0;j<dizi.length-i-1;j++) {
				if(dizi[j]>dizi[j+1]) {
					temp=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=temp;
				}
			}
		}
		for(int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+",");
		}
	}

	public static void main(String[] args) {
		int[] dizi= {10, 2, 8, 3, 9, 4, 1, -1};
		bublesort(dizi);
	}
}

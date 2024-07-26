package sıralamaalgoritmaları;
public class select{
	public static void selectionSort(int[] dizi) {
		for(int i=0;i<dizi.length;i++) {
			int minindex=i;
			for(int j=i+1;j<dizi.length;j++) {
				if(dizi[minindex]>dizi[j]) {
					minindex=j;
				}
			}
			int temp=dizi[minindex];
			dizi[minindex]=dizi[i];
			dizi[i]=temp;
		}
		for(int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+", ");
		}
	}
	

	public static void main(String[] args) {
		int[] dizi= {10, 2, 8, 3, 9, 4, 1, -1};
		selectionSort(dizi);
	}
}

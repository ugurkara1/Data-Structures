package matriscarp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//matris boyutları
		System.out.println("matris 1 in satır ve sutun sayısını girin:");
		int satir1=scanner.nextInt();
		int sutun1=scanner.nextInt();
		System.out.println("matris 2 nin satir ve sutun sayısını girin:");
		int satir2=scanner.nextInt();
		int sutun2=scanner.nextInt();
		
		if(sutun1!=satir2) {
			System.out.println("matrislerin boyutları uyumsuz.");
		}
		int[][] matris1=new int[satir1][sutun1];
		int[][] matris2=new int[satir2][sutun2];
		
		matrisGirAl(matris1,"matris1",scanner);
		matrisGirAl(matris2,"matris2",scanner);


		MatrisIslemleri matrisislemleri =new MatrisCarpim();
		int[][] carpim=matrisislemleri.carp(matris1, matris2);
		System.out.println("matris çarpımı:");
		matrisiYazdir(carpim);
	}
	private static void matrisiYazdir(int[][] matris) {
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				System.out.println(matris[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static void matrisGirAl(int [][] matris,String matrisAdi,Scanner scanner) {
		System.out.println(matrisAdi+"elemanlarını girin:");
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				matris[i][j]=scanner.nextInt();
			}
		}
	}
}

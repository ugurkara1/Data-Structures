package sayıtahmin;

import java.util.Scanner;

public class SayıTahmin {

	public static void main(String[] args) {
		int cevap=20;
		
		int girdi=0;
		boolean oyundevam=true;
		Scanner sc=new Scanner(System.in);
		while(oyundevam) {
			System.out.println("bir sayı giriniz:");
			girdi=sc.nextInt();
			if(girdi>cevap) {
				System.out.println("tahmini küçült");

			}
			else if(girdi<cevap) {
				System.out.println("tahmini büyült");
			}
			else if (girdi==cevap) {
				System.out.println("tebrikler bildiniz");
				oyundevam=false;
			}
		}
	}

}

package pideciuygulaması;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int secim =-1,n;
		System.out.println("kuyruk yapısının eleman sayısı:");n=scanner.nextInt();
		kuyrukpideyapi kuyruk =new kuyrukpideyapi(n);
		while(secim!=0) {
			System.out.println("1-Yeni müşteri ekle");
			System.out.println("2-satış yap");
			System.out.println("3-bekleyen müşteriler");
			System.out.println("4-toplam gelir");
			System.out.println("0-çıkış");
			scanner.nextLine();
			secim=scanner.nextInt();
			switch(secim) {
			case 1:kuyruk.enQueue();break;
			case 2:kuyruk.deQueue();break;
			case 3:kuyruk.print();break;
			case 4:System.out.println("toplam gelir:"+kuyruk.toplamglr);break;
			case 0:System.out.println("çıkış yaptınız");break;
			default: System.out.println("hatalı işlem");
			}

		}
		
	}

}

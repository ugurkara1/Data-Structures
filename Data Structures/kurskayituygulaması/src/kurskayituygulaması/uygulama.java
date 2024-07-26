package kurskayituygulaması;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,secim=-1;
		System.out.println("kursa kayıt edilecek kişi sayısı:"); n= scanner.nextInt();
		
		kursstack bilgisayarkurslistesi=new kursstack(n);
		
		while(secim!=0) {
			System.out.println("1-kursa yeni kayıt");
			System.out.println("2-en son kaydı sil");
			System.out.println("3-kursa kayıtlı kişiler");
			System.out.println("4-en son kayıtlı kişi bilgileri");
			System.out.println("0-çıkış");secim=scanner.nextInt();
			System.out.println("5-kalan kontenjan bilgileri");

		
			switch(secim) {
			case 1: bilgisayarkurslistesi.ekle();break;
			case 2: bilgisayarkurslistesi.sil();break;
			case 3: bilgisayarkurslistesi.yazdır();break;
			case 4: bilgisayarkurslistesi.ensonkayit();break;
			case 5: bilgisayarkurslistesi.kalankontenjansys();break;
			case 0: System.out.println("çıkış yaptınız");break;
			default :System.out.println("hatalı seçim yaptınız[0-5]");
			}
		}
		
	}

}

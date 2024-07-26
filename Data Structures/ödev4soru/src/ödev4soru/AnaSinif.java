package ödev4soru;
import java.util.LinkedList;
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        StackLınkedList yigin = new StackLınkedList();
		        while (true) {
		            System.out.println("1. Yığına ekle");
		            System.out.println("2. Yığından sil");
		            System.out.println("3. Yığın eleman sayısı");
		            System.out.println("4. Yığında ara");
		            System.out.println("5. Yığınu listele");
		            System.out.println("0. Çıkış");
		            System.out.print("İstediğiniz komutu giriniz: ");

		            int secim = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (secim) {
		                case 1:
		                    System.out.print("Yığına eklenecek yeni adı giriniz: ");
		                    String ad = scanner.nextLine();
		                    System.out.print("Yığına eklenecek yeni soyadı giriniz: ");
		                    String soyad = scanner.nextLine();
		                    System.out.print("Yığına eklenecek yeni doğum tarihini giriniz: ");
		                    int dt = scanner.nextInt();
		                    scanner.nextLine();
		                    System.out.print("Yığına eklenecek yeni telefon numarasını giriniz: ");
		                    String telno = scanner.nextLine();
		                    Eleman yeniEleman = new Eleman(ad, soyad, dt, telno);
		                    yigin.yiginaEkle(yeniEleman);
		                    break;
		                case 2:
		                    yigin.yigindanSil();
		                    break;
		                case 3:
		                    yigin.yiginElemanSayisi();
		                    break;
		                case 4:
		                    System.out.print("Yığında aranacak ismi giriniz: ");
		                    String arananIsim = scanner.nextLine();
		                    yigin.yigindaAra(arananIsim);
		                    break;
		                case 5:
		                    yigin.yiginListele();
		                    break;
		                case 0:
		                    System.out.println("Çıkış yapılıyor...");
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Geçersiz komut! Lütfen tekrar deneyin.");
		            }
		        }
	}
}

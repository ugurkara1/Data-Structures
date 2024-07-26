package kuyruklınkedlist;
import java.util.Scanner;
public class AnaSinif {

	public static void main(String[] args) {
		KuyrukLinkedList kuyruk=new KuyrukLinkedList();
		Scanner scanner = new Scanner(System.in);		
		int secim;
		do {
			System.out.println("1. Kuyruğa ekle");
            System.out.println("2. Kuyruktan sil");
            System.out.println("3. Kuyruk eleman sayısı");
            System.out.println("4. Kuyrukta ara");
            System.out.println("5. Kuyruğu listele");
            System.out.println("0. Çıkış");
            System.out.print("İstediğiniz komutu giriniz: ");
            secim = scanner.nextInt();
            scanner.nextLine(); // Dummy read to consume the newline
            
            switch (secim) {
            case 1:
                System.out.print("Kuyruğa eklenecek yeni adı giriniz: ");
                String ad = scanner.nextLine();
                System.out.print("Kuyruğa eklenecek yeni soyadı giriniz: ");
                String soyad = scanner.nextLine();
                System.out.print("Kuyruğa eklenecek yeni doğum tarihini giriniz: ");
                String dogumTarihi = scanner.nextLine();
                System.out.print("Kuyruğa eklenecek yeni telefon numarasını giriniz: ");
                String telefonNo = scanner.nextLine();
                Eleman yeniEleman = new Eleman(ad, soyad, dogumTarihi, telefonNo);
                kuyruk.kuyrukekle(yeniEleman);
                break;
            case 2:
                kuyruk.kuyruktansil();
                break;
            case 3:
                System.out.println("Kuyrukda " + kuyruk.kuyrukElemanSayisi() + " adet eleman vardır.");
                break;
            case 4:
                System.out.print("Kuyrukta aranacak ismi giriniz: ");
                String arananIsim = scanner.nextLine();
                kuyruk.kuyruktanAra(arananIsim);
                break;
            case 5:
                kuyruk.kuyruklistele();
                break;
            case 0:
                System.out.println("Programdan çıkılıyor...");
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
        }
    } while (secim != 0);
    scanner.close();
}
}

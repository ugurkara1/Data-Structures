package ödev2;
import java.util.LinkedList;
import java.util.Scanner;
public class AnaSinif {
	
	public static void main(String[] args) {
		LinkedList<Eleman> liste =new LinkedList<>();
		Scanner scanner=new Scanner(System.in);
		int secim;
		 do {
	            System.out.println("1. Listeye ekle");
	            System.out.println("2. Listeden sil");
	            System.out.println("3. Liste eleman sayısı");
	            System.out.println("4. Listede ara");
	            System.out.println("5. Liste yaz");
	            System.out.println("0. Çıkış");
	            System.out.print("İstediğiniz komutu giriniz: ");
	            secim = scanner.nextInt();
	            scanner.nextLine(); // Dummy read to consume the newline

	            switch (secim) {
	                case 1:
	                    System.out.print("Listeye eklenecek yeni adı giriniz: ");
	                    String ad = scanner.nextLine();
	                    System.out.print("Listeye eklenecek yeni soyadı giriniz: ");
	                    String soyad = scanner.nextLine();
	                    System.out.print("Listeye eklenecek yeni doğum tarihini giriniz: ");
	                    String dogumtarihi = scanner.nextLine();
	                    System.out.print("Listeye eklenecek yeni telefon numarasını giriniz: ");
	                    String telefonno = scanner.nextLine();
	                    Eleman yeniEleman = new Eleman(ad, soyad, dogumtarihi, telefonno);
	                    liste.add(yeniEleman);
	                    break;
	                case 2:
	                    System.out.print("Listeden silinecek kişinin adını giriniz: ");
	                    String silinecekAd = scanner.nextLine();
	                    Eleman silinecekEleman = null;
	                    for (Eleman eleman : liste) {
	                        if (eleman.ad.equals(silinecekAd)) {
	                            silinecekEleman = eleman;
	                            break;
	                        }
	                    }
	                    if (silinecekEleman != null) {
	                        liste.remove(silinecekEleman);
	                        System.out.println("Silme işlemi tamamlanmıştır.");
	                    } else {
	                        System.out.println("Listede değer bulunamamıştır.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Listede " + liste.size() + " adet eleman vardır.");
	                    break;
	                case 4:
	                    System.out.print("Listede aranacak ad, soyad, doğum tarihi veya telefon numarasını giriniz: ");
	                    String aranan = scanner.nextLine();
	                    int index = liste.indexOf(aranan);
	                    if (index != -1) {
	                        System.out.println("Aranan değer listenin " + (index + 1) + ". sırasındadır.");
	                    } else {
	                        System.out.println("Listede değer bulunamamıştır.");
	                    }
	                    break;
	                case 5:
	                    if (liste.isEmpty()) {
	                        System.out.println("Liste boş");
	                    } else {
	                        for (Eleman eleman : liste) {
	                            System.out.println("Ad: " + eleman.ad + ", Soyad: " + eleman.soyad + ", Doğum Tarihi: " + eleman.dogumtarihi + ", Telefon Numarası: " + eleman.telefonno);
	                        }
	                    }
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

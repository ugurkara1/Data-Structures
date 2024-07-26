package ödev2soru;

import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		BagliListe liste = new BagliListe();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Listeye eleman ekle");
            System.out.println("2. Listeden eleman sil");
            System.out.println("3. Eleman ara");
            System.out.println("4. Listeyi yazdır");
            System.out.println("5. Çıkış");

            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Dummy nextLine() call to consume the newline character

            switch (secim) {
                case 1:
                    System.out.print("Ad Soyad: ");
                    String adSoyad = scanner.nextLine();
                    System.out.print("Doğum Tarihi: ");
                    String dogumTarihi = scanner.nextLine();
                    System.out.print("Telefon Numarası: ");
                    String telefonNumarasi = scanner.nextLine();

                    Eleman yeniEleman = new Eleman(adSoyad, dogumTarihi, telefonNumarasi);
                    liste.elemanekle(yeniEleman);
                    break;

                case 2:
                    System.out.print("Silinecek elemanın adı, doğum tarihi veya telefon numarası: ");
                    String silinecekIcerik = scanner.nextLine();
                    liste.elemanSil(silinecekIcerik);
                    break;

                case 3:
                    System.out.print("Aranacak elemanın adı, doğum tarihi veya telefon numarası: ");
                    String arananIcerik = scanner.nextLine();
                    Eleman bulunanEleman = liste.elemanAra(arananIcerik);
                    if (bulunanEleman != null) {
                        System.out.println("Bulunan Eleman: Ad Soyad: " + bulunanEleman.getAdsoyad()+", Doğum Tarihi: " + bulunanEleman.getDogumtarihi() +", Telefon Numarası: " + bulunanEleman.getTelefonnumarası());
                    } else {
                        System.out.println("Eleman bulunamadı.");
                    }
                    break;

                case 4:
                    liste.listeYazdir();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
                    break;
            }
        }
    }

}

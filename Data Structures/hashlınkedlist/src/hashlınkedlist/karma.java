package hashlınkedlist;

import java.util.LinkedList;

public class karma {
	private static final int TABLO_BOYUTU = 10; // Hash tablosu boyutu

    private LinkedList<Cift>[] hashTablosu;

    // Anahtar-değer çiftlerini tutmak için Pair sınıfı
    private static class Cift {
        int anahtar;
        String deger;

        Cift(int anahtar, String deger) {
            this.anahtar = anahtar;
            this.deger = deger;
        }
    }
 // Hash tablosunu başlatmak için constructor
    public karma() {
        hashTablosu = new LinkedList[TABLO_BOYUTU];
        for (int i = 0; i < TABLO_BOYUTU; i++) {
            hashTablosu[i] = new LinkedList<>();
        }
    }
    // Verilen anahtar için hash fonksiyonu
    private int hashFonksiyonu(int anahtar) {
        return anahtar % TABLO_BOYUTU;
    }
    // Anahtar-değer çiftlerini hash tablosuna eklemek için metod
    public void ekle(int anahtar, String deger) {
        int indeks = hashFonksiyonu(anahtar);
        LinkedList<Cift> liste = hashTablosu[indeks];

        // Anahtar zaten varsa, değeri güncelle
        for (Cift cift : liste) {
            if (cift.anahtar == anahtar) {
                cift.deger = deger;
                return;
            }
        }

        // Anahtar yoksa, LinkedList'e ekle
        liste.add(new Cift(anahtar, deger));
    }

    // Verilen anahtarın karşılık gelen değerini getirmek için metod
    public String getir(int anahtar) {
        int indeks = hashFonksiyonu(anahtar);
        LinkedList<Cift> liste = hashTablosu[indeks];

        // Anahtar için LinkedList'teki değeri ara
        for (Cift cift : liste) {
            if (cift.anahtar == anahtar) {
                return cift.deger;
            }
        }

        return null; // Anahtar bulunamadı
    }

    public static void main(String[] args) {
        karma hashi = new karma();

        // Bazı anahtar-değer çiftleri ekleyelim
        hashi.ekle(1, "Bir");
        hashi.ekle(11, "Onbir");
        hashi.ekle(21, "Yirmi bir");

        // Anahtarları kullanarak değerleri alalım
        System.out.println("Anahtar 1 için değer: " + hashi.getir(1));
        System.out.println("Anahtar 11 için değer: " + hashi.getir(11));
        System.out.println("Anahtar 21 için değer: " + hashi.getir(21));
        System.out.println("Hash Tablosu Boyutu: " + TABLO_BOYUTU);
        for (int i = 0; i < TABLO_BOYUTU; i++) {
            LinkedList<Cift> liste = hashi.hashTablosu[i];
            System.out.print("Index " + i + ": ");
            for (Cift cift : liste) {
                System.out.print("(" + cift.anahtar + "," + cift.deger + ") ");
            }
            System.out.println();
        }
    }

}

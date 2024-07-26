package ödev32;

import java.util.LinkedList;

public class Karma {
	LinkedList<Eleman>[] bl;
	public Karma() {
		bl=new LinkedList[29];
		for(int i=0;i<29;i++) {
			bl[i]=new LinkedList<>();
		}
	}
    // Karma fonksiyonu: Eleman sınıfı altındaki “isim” özelliğinin ilk harfine göre adresleme yapacaktır.
	void ekle(Eleman eleman) {
        char ilkHarf = eleman.isim.toUpperCase().charAt(0);
        int indeks = (int) ilkHarf - 65; // ASCII değerinden başlayarak indeksi belirle
        if (indeks >= 0 && indeks < 29) {
            bl[indeks].addFirst(eleman); // İlk eleman olarak ekleme
        }
	}
	// Tüm Karma Tablo Listeleme
    void tumunuListele() {
        for (int i = 0; i < 29; i++) {
            if (!bl[i].isEmpty()) {
                System.out.print((char) (i + 65) + " - -> ");
                for (Eleman eleman : bl[i]) {
                    System.out.print(eleman.isim + " ");
                }
                System.out.println();
            }
        }
    }
 // Tüm Karma Tablo eleman sayısı
    int elemanSayisi() {
        int toplam = 0;
        for (int i = 0; i < 29; i++) {
            toplam += bl[i].size();
        }
        return toplam;
    }
 // Herhangi bir harfe ait Karma Tablo listeleme
    void harfeAitListele(char harf) {
        int indeks = (int) Character.toUpperCase(harf) - 65;
        if (indeks >= 0 && indeks < 29 && !bl[indeks].isEmpty()) {
            System.out.print(harf + " - -> ");
            for (Eleman eleman : bl[indeks]) {
                System.out.print(eleman.isim + " ");
            }
            System.out.println();
        } else {
            System.out.println("Belirtilen harfe ait kayıt bulunamadı.");
        }
    }
    // Herhangi bir harfe ait Karma Tablo eleman sayısı
    int harfeAitElemanSayisi(char harf) {
        int indeks = (int) Character.toUpperCase(harf) - 65;
        if (indeks >= 0 && indeks < 29) {
            return bl[indeks].size();
        } else {
            return 0;
        }
    }

    // Karma Tablodan eleman silme/çekme
    void sil(char harf, int index) {
        int indeks = (int) Character.toUpperCase(harf) - 65;
        if (indeks >= 0 && indeks < 29 && index >= 0 && index < bl[indeks].size()) {
            Eleman eleman = bl[indeks].remove(index);
            System.out.println("Silinen eleman: " + eleman.isim);
        } else {
            System.out.println("Belirtilen konumda eleman bulunamadı.");
        }
    }
}

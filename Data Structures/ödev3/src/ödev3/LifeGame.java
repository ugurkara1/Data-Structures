package ödev3;
import java.io.IOException;
public class LifeGame {
	final int habitatSatir=19;
	final int habitatSutun=19;
	
	int hucreHabitat[][];
	int hucreHabitatTmp[][];
	int[] pulsarSatir;
	int[] pSatir;
	
	int pulsarSutun[];
	public LifeGame() {
		//pulsar desni oluşması için gerekli ön tanımlamalar 
		pSatir = new int[] { 3, 8, 10, 15 };
		pulsarSatir = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
		pulsarSutun = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
		
		// gerçek yaşam alanı ve değişikliklerin yapılacağı yedek yaşam alanı tanımı
		hucreHabitat = new int[habitatSatir][habitatSutun];
		hucreHabitatTmp = new int[habitatSatir][habitatSutun];
		
		// tüm yedek ve gerçek yaşam alanı sıfırlanıyor
		int c = 0;
		for (int i = 0; i < habitatSatir; i++) {
			for (int y = 0; y < habitatSutun; y++) {
				hucreHabitatTmp[i][y] = c;
				hucreHabitat[i][y] = c;
			}
		}
		// pulsar deseni gerçek yaşam alanına atanıyor
		for (int satir = 0; satir < pSatir.length; satir++) {
			for (int sutun = 0; sutun < habitatSutun; sutun++) {
				hucreHabitat[pSatir[satir]][sutun] = pulsarSatir[sutun];
			}
		}
		for (int sutun = 0; sutun < pSatir.length; sutun++) {
			for (int satir = 0; satir < habitatSutun; satir++) {
				hucreHabitat[satir][pSatir[sutun]] = pulsarSatir[satir];
			}
		}
	}
	public void drawHabitat() {
		// Gerçek yaşam alanı (hucreHabitat) ekrana çizdiriliyor
	    for (int i = 1; i < habitatSatir - 1; i++) {
	        for (int j = 1; j < habitatSutun - 1; j++) {
	            if (hucreHabitat[i][j] == 1) {
	                System.out.print("# "); // Canlı hücreyi temsil et
	            } else {
	                System.out.print("- "); // Ölü hücreyi temsil et
	            }
	        }
	        System.out.println(); // Yeni satıra geç
	    }
	}
	public int komsuCanliSayisi(int satir, int sutun) {
	    int canliKomsuSayisi = 0;
	    // Koordinatları girilen hücre merkezde olmak üzere 3x3 lük alanda
	    // canlı komşu sayısı tespiti yapılıyor. Eğer kendisi de canlı ise
	    // canlı komşuya eklenmemelidir.
	    for (int i = -1; i <= 1; i++) {
	        for (int j = -1; j <= 1; j++) {
	            if (!(i == 0 && j == 0)) { // Merkez hücreyi kontrol etme
	                if (hucreHabitat[satir + i][sutun + j] == 1) {
	                    canliKomsuSayisi++;
	                }
	            }
	        }
	    }
	    return canliKomsuSayisi;
	}
	public void newHabitatRule() {
	    // Life Game'in 4 kuralına göre gerçek habitata bakılarak
	    // bir sonraki iterasyon için geçici habitat (hucreHabitatTmp)
	    // güncelleniyor
	    for (int i = 1; i < habitatSatir - 1; i++) {
	        for (int j = 1; j < habitatSutun - 1; j++) {
	            int canliKomsu = komsuCanliSayisi(i, j);
	            if (hucreHabitat[i][j] == 1) {
	                if (canliKomsu < 2 || canliKomsu > 3) {
	                    hucreHabitatTmp[i][j] = 0; // Ölüm
	                }
	            } else {
	                if (canliKomsu == 3) {
	                    hucreHabitatTmp[i][j] = 1; // Yeniden üreme
	                }
	            }
	        }
	    }
	    copyHabitat(); // Geçici habitatı gerçek habitata kopyala
	}
	public void copyHabitat() {
	    // Geçici habitattaki değerler gerçek yaşam alanına aktarılıyor
	    for (int i = 1; i < habitatSatir - 1; i++) {
	        for (int j = 1; j < habitatSutun - 1; j++) {
	            hucreHabitat[i][j] = hucreHabitatTmp[i][j];
	        }
	    }
	}

	
	public static void main(String[] args) throws InterruptedException {
		LifeGame lg = new LifeGame();
	    for (int i = 0; i < 20; i++) {
	        lg.drawHabitat(); // Habitatı çiz
	        lg.newHabitatRule(); // Yeni habitat kurallarını uygula
	        System.out.println(); // Boş bir satır ekle
	        Thread.sleep(1500); // 1.5 saniye bekle
	    }
	}

}

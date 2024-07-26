package ödev2soru;
import java.util.LinkedList;


public class BagliListe {
    private LinkedList<Eleman> elemanlar;

    public BagliListe() {
        elemanlar = new LinkedList<>();
    }
	public void elemanekle(Eleman yenieleman) {
		elemanlar.addFirst(yenieleman);
	}
    public void elemanSil(String arananIcerik) {
        elemanlar.removeIf(eleman -> eleman.getAdsoyad().contains(arananIcerik) ||
                eleman.getDogumtarihi().contains(arananIcerik) ||
                eleman.getTelefonnumarası().contains(arananIcerik));
    }
    public Eleman elemanAra(String arananIcerik) {
        for (Eleman eleman : elemanlar) {
            if (eleman.getAdsoyad().contains(arananIcerik) ||
                    eleman.getDogumtarihi().contains(arananIcerik) ||
                    eleman.getTelefonnumarası().contains(arananIcerik)) {
                return eleman;
            }
        }
        return null;
    }
    public void listeYazdir() {
        if (elemanlar.isEmpty()) {
            System.out.println("Liste boş.");
        } else {
            for (Eleman eleman : elemanlar) {
                System.out.println("Ad Soyad: " + eleman.getAdsoyad() + ", Doğum Tarihi: " + eleman.getDogumtarihi() + ", Telefon Numarası: " + eleman.getTelefonnumarası());
            }
        }
    }
}

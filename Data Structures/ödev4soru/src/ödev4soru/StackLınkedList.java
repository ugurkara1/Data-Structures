package ödev4soru;
import java.util.LinkedList;
public class StackLınkedList {
	 LinkedList<Eleman> yigin = new LinkedList<>();

	    void yiginaEkle(Eleman eleman) {
	        yigin.push(eleman);
	        System.out.println("Yığına ekleme başarılı.");
	    }

	    void yigindanSil() {
	        if (yigin.isEmpty()) {
	            System.out.println("Yığın boş.");
	        } else {
	            Eleman silinen = yigin.pop();
	            System.out.println("Yığından silinen kişi: " + silinen.ad + " " + silinen.soyad +
	                    " " + silinen.dt + " " + silinen.telno);
	            System.out.println("Silme işlemi tamamlanmıştır.");
	        }
	    }

	    void yiginElemanSayisi() {
	        System.out.println("Yığında " + yigin.size() + " adet eleman vardır.");
	    }

	    void yigindaAra(String arananIsim) {
	        int index = yigin.indexOf(yigin.stream().filter(e -> e.ad.equalsIgnoreCase(arananIsim)).findFirst().orElse(null));

	        if (index != -1) {
	            System.out.println("Aranan isim yığının " + (index + 1) + ". sırasındadır.");
	        } else {
	            System.out.println("Yığında aranan " + arananIsim + " bulunamamıştır.");
	        }
	    }

	    void yiginListele() {
	        if (yigin.isEmpty()) {
	            System.out.println("Yığın boş.");
	        } else {
	            for (Eleman eleman : yigin) {
	                System.out.println(eleman.ad + " " + eleman.soyad + " " + eleman.dt + " " + eleman.telno);
	            }
	        }
	    }
}

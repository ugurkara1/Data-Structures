package ciftyönlübağlilist;

public class uygulama {

	public static void main(String[] args) {
		baglilist baglı=new baglilist();
		baglı.basaekle(10);
		baglı.basaekle(25);
		baglı.sonaekle(30);
		baglı.sonaekle(20);

		baglı.yazdir();
		baglı.arayaekle(2, 12);
		baglı.yazdir();
		baglı.aradansil(1);
		baglı.yazdir();
		baglilist kopyaListe = new baglilist();
		baglı.kopyalaYapıstır(baglı.head, baglı.tail, kopyaListe.head);
		kopyaListe.yazdir();
	}

}

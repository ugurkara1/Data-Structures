package eskidenyeniye1;

public class uygulama {

	public static void main(String[] args) {
		lınkedlıst liste=new lınkedlıst();
		liste.basaekle(2);
		liste.basaekle(4);
		liste.basaekle(6);
		liste.yazdir();
		System.out.println();
		liste.sonaekle(15);
		liste.yazdir();
		System.out.println();
		liste.indekseEkle(-1, 0);
		liste.indekseEkle(-4, 33);
		liste.indekseEkle(0, 2);
		liste.indekseEkle(2, 0);
		liste.bastansil();
		liste.sondansil();
		liste.sondansil();
		liste.yazdir();
	}

}

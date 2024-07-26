package hashogrencikayıt;

public class uygulama {

	public static void main(String[] args) {
		hash tablo=new hash(5);
		tablo.ekle(1, "ahmet", 75);
		tablo.ekle(12, "veli", 80);
		tablo.ekle(14, "hasan", 40);
		tablo.ara(14);
		tablo.yazdır();
	}

}

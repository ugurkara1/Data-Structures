package hash2;

public class uygulama {

	public static void main(String[] args) {
		hash tablo=new hash(5);
		tablo.ekle(0, "ahmet");
		tablo.ekle(10, "mehmet");
		
		tablo.ekle(3, "uğur");
		tablo.ekle(4, "hüseyin");
		
		tablo.ekle(2, "muzaffer");
		tablo.ekle(22, "reşit");
		
		tablo.ekle(15, "mert");
		tablo.yazdır();

	}

}

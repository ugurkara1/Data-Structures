package sınavbaglılist;

public class uygulama {

	public static void main(String[] args) {
		baglılist list=new baglılist();
		list.ekle(10, "ugur", "kara", 50, 40);
		list.yazdır();
		list.sil(10);
		list.ekle(10, "ugur", "kara", 50, 40);
		list.ekle(20, "ugur", "kara", 80, 40);
		list.ekle(30, "ugur", "kara", 90, 40);
		list.ekle(40, "ugur", "kara", 10, 50);
		list.ekle(50, "ugur", "kara", 50, 40);
		list.sil(50);
		list.yazdır();
		list.enbasarılı();
	}

}

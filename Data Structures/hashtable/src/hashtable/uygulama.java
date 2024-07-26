package hashtable;

public class uygulama {

	public static void main(String[] args) {
		hash htablo=new hash(5);
		htablo.ekle(0, "ahmet");
		htablo.ekle(10, "mehmet");

		htablo.ekle(3, "hasan");
		htablo.ekle(4, "hüseyin");
		
		htablo.ekle(2, "muzaffer");
		htablo.ekle(22, "yunus");
		htablo.ekle(15, "berke");
		htablo.ekle(9, "serkan");
		
		//System.out.println(htablo.dizi[0].next.next.isim);
		//System.out.println(htablo.dizi[3].next.isim);
		htablo.sil(3);
		htablo.sil(10);
		htablo.sil(15);
		htablo.sil(0);
		htablo.sil(2);
		htablo.sil(22);
		htablo.sil(9);
		htablo.sil(3);
		htablo.sil(100);
		
		htablo.ekle(0, "ahmet");
		htablo.ekle(1, "hüseyin");
		htablo.ekle(2, "muzaffer");
		htablo.ekle(4, "yusuf");
		htablo.ekle(10," berkay");
		htablo.ekle(15, "mustafa");
		htablo.ekle(12," serkan");
		htablo.ekle(9," reşit");

		htablo.sil(12);
		System.out.println();
		htablo.yazdır();
	}

}

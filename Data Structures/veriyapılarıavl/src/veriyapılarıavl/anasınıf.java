package veriyapılarıavl;

public class anasınıf {

	public static void main(String[] args) {        
		avlagac aa = new avlagac();

		aa.kok = aa.ekle(aa.kok, 100);
		aa.kok = aa.ekle(aa.kok, 50);
		aa.kok = aa.ekle(aa.kok, 75);
		aa.kok = aa.ekle(aa.kok, 40);
		aa.kok = aa.ekle(aa.kok, 30);
		// AVL ağacındaki elemanları diziye ekle
		System.out.println(aa.avlElemanlariDiziyeEkle());
}
}

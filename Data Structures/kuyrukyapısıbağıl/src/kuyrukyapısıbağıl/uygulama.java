package kuyrukyapısıbağıl;

public class uygulama {

	public static void main(String[] args) {
		kuyrukyapısı kuyruk=new kuyrukyapısı(5);
		kuyruk.ekle(10);
		kuyruk.ekle(20);
		kuyruk.ekle(30);
		kuyruk.ekle(400);
		kuyruk.ekle(500);
		kuyruk.print();
		kuyruk.sil();
		kuyruk.print();


	}

}

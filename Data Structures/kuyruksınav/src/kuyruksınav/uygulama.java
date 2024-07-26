package kuyruksınav;

public class uygulama {

	public static void main(String[] args) {
		kuyrukyapısı kuyruk=new kuyrukyapısı(5);
		kuyruk.enqueue(30);
		kuyruk.enqueue(10);
		kuyruk.enqueue(20);
		kuyruk.enqueue(40);
		kuyruk.enqueue(50);
		kuyruk.enqueue(30);

		
		kuyruk.dequeue();
		kuyruk.yazdır();
		System.out.println("kuyruğun başındaki eleman :"+ kuyruk.dizi[kuyruk.front]);


	}

}

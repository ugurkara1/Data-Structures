package kuyrukdiziler;

public class uygulama {

	public static void main(String[] args) {
		kuyrukyapisi kuyruk=new kuyrukyapisi(5);
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		
		
		kuyruk.deQueue();
		kuyruk.deQueue();
		kuyruk.deQueue();
		kuyruk.deQueue();
		kuyruk.deQueue();
		kuyruk.deQueue();
		kuyruk.deQueue();

		
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		kuyruk.elemansayısı();
		kuyruk.yazdir();
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		kuyruk.yazdir();

	}
	
}

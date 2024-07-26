package kuyrukdiziler;

public class kuyrukyapisi {
	int [] dizi;
	int size;
	int front; //dizinin baştaki elemanı
	int rear; //dizinin sondaki elemanı
	public kuyrukyapisi(int size) {
		this.size = size;
		dizi=new int[size]; //kuyruk yapısı
		front=0;
		rear=-1;
		
		
	}
	void enQueue(int data) {
		if(isFull()) {
			System.out.println("kuyruk dolu,ekleme yapamazsınız");
		}
		else {
		
		rear++;
			dizi[rear]=data;
		System.out.println(dizi[rear]+"kuyruğa eklendi");
		}
	}
	void deQueue() {
		if (isEmpty()) {
			System.out.println("kuyruk boş,silinecek eleman yoktur");
		}
		else {
			int sayi=dizi[front];
			for(int i=1;i<=rear;i++) {
			dizi[i-1]=dizi[i];
			System.out.println(sayi+"kuyruktan silindi");

		    }
			rear--;

		}	
	}
	
	private boolean isEmpty() {
		return rear==-1;
	}
	private boolean isFull() {
		
		return rear==size-1;
	}	
	void elemansayısı() {
		System.out.println("eleman sayısı"+ (rear+1));
	}
	void yazdir() {
		int i=rear;
		System.out.println("son->");
		while(i>=0) {
			System.out.print(dizi[i]+"->");
			i--;
			
		}	
		System.out.println("boş");
	}
}

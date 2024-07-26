package kuyruksınav;

public class kuyrukyapısı {
	int [] dizi;
	int size;
	int front;
	int rear;
	public kuyrukyapısı(int size) {
		this.size = size;
		dizi=new int[size];
		front=0;
		rear=-1;
	}
	void enqueue(int data) {
		if(isFull()) {
			System.out.println("kuyruk dolu ekleme yapamazsınız");
		}
		else {
			rear++;
			dizi[rear]=data;
		}
		System.out.println(dizi[rear]+" kuyruğa eklendi"); 
		
	}

	void dequeue() {
		if (isEmpty()) {
			System.out.println("kuyruk boş silinecek eleman yok");
		}
		else {
			int sayı=dizi[front];
			for(int i=1;i<=rear;i++) {
				dizi[i-1]=dizi[i];
			}
			rear--;
			System.out.println(sayı+"  kuyruktan çıkartıldı");

		}
	}
	void elemansayısı() {
		System.out.println("eleman sayısı :"+(rear+1));
	}
	void yazdır() {
		int i=rear;
		System.out.print("son ->");
		while(i>=0) {
			System.out.print(dizi[i]+" ->");
			i--;
		}
		System.out.println("boş");
	}
	private boolean isEmpty() {
		return rear==-1;
	}
	private boolean isFull() {
		return rear==size-1;
	}
}


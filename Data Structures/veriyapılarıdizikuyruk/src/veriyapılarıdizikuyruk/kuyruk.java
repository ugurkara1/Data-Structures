package veriyapılarıdizikuyruk;

public class kuyruk {
	int[] dizi;
	int N;
	int front;
	int rear;
	public kuyruk(int N) {
		this.N=N;
		dizi=new int[N];
		front=0;
		rear=-1;
	}
	void ekle(int data) {
		if(isFull()) {
			System.out.println("kuyruk dolu ekleme yapılamadı");
		}
		else {
			rear++;
			dizi[rear]=data;
			System.out.println(dizi[rear]+"kuyruğa eklendi");
		}
	}
	void sil() {
		if(isEmpty()) {
			System.out.println("kuyruk boş silinecek eleman bulunamadı");
		}
		else {
			int data=dizi[front];
			for(int i=1;i<=rear;i++) {
				dizi[i-1]=dizi[i];
			}
			System.out.println(data+"kuyruktan silindi");
			rear--;
		}
	}
	private boolean isEmpty() {
		return rear==-1;
	}
	private boolean isFull() {
		return rear==N-1;
	}
}

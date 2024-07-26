package stack1;

public class stackyıgın {
	int dizi[];
	int size;
	int indis;
	public stackyıgın(int size) {
		this.size=size;
		dizi=new int[size];
		indis=-1;
	}
	void push(int data) {
		if(isFull()) {
			System.out.println("stack dolu ekleme yapılamadı");
		}
		else {
			indis++;
			dizi[indis]=data;
			System.out.println("push(): "+dizi[indis]);
		}
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("stack boş silinecek eleman bulunamadı");
			return -1;
		}
		else {
			return dizi[indis--];
		}
	}
	private boolean isFull() {
		return indis==size-1;
	}
	private boolean isEmpty() {
		return indis==-1;
	}
}

package sınavstack;

public class stackyıgın {
	int[] dizi;
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
			System.out.println("push():"+dizi[indis]);
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
	boolean isFull() {
		return indis==size-1;
	}
	boolean isEmpty() {
		return indis==-1;
	}
	void yazdir() {
		if(isEmpty()) {
			System.out.println("stack boş yazdırılacak eleman bulunamadı");
		}
		else {
			int n=-1;
			while(n<dizi.length-1) {
				n++;
				System.out.println(dizi[n]);
			}
		}
	}
}

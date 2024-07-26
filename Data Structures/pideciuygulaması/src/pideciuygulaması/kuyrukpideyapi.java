package pideciuygulaması;

import java.util.Scanner;

public class kuyrukpideyapi {
	Scanner scanner=new Scanner(System.in);
	nodepide front;
	nodepide rear;
	int size;
	int cnt;
	public kuyrukpideyapi(int size) {
		this.size = size;
		cnt=0;
		front=null;
		rear=null;
	}
	int toplamglr=0;
	String isim;
	int adet;
	void enQueue() {
		if(isFull()) {
			System.out.println("kuyruk sırası dolu");
		}
		else {
			System.out.println("müşteri ismi:"); isim=scanner.nextLine();
			System.out.println("pide sayısı:"); adet=scanner.nextInt();
			scanner.nextLine();
			nodepide eleman=new nodepide(isim,adet);
			if(isEmpty()) {
				front=eleman;
				rear=eleman;
				System.out.println("kuyruk yapısı oluşturuldu ve ilk müşteri sıraya girdi");
			}
			else {
				
				rear.next=eleman;
				rear=eleman;
				System.out.println(rear.isim+"sıraya girdi");

			}
			cnt++;
		}
	}
	
	
	void deQueue() {
		if(isEmpty()) {
			System.out.println("pide sırasında bekleyen müşteri yoktur");
		}
		else {
			toplamglr+=front.ücret;
			System.out.println(front.isim+" "+front.adet+" pidesini aldı,toplam borcu"+front.ücret+"TL");
			front=front.next;
			cnt--;
		}
	}
	void print() {
		if(isEmpty()) {
			System.out.println("Bekleyen müşteri yok");
		}
		else {
			nodepide temp=front;
			while(temp!=null) {
				System.out.print(temp.isim + "<-");
				temp=temp.next;
			}
		}
	}
	boolean isEmpty() {
		return cnt==0;
	}
	boolean isFull() {
		return cnt==size;
	}



}

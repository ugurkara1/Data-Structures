package kuyrukyapısıbağıl;

public class kuyrukyapısı {
	node front;
	node rear;
	int cnt;
	int size;
	public kuyrukyapısı(int size) {
		this.size=size;
		cnt=0;
		front=null;
		rear=null;
	}
	void ekle(int data) {
		node eleman=new node(data);
		if(isEmpty()) {
			front=eleman;
			rear=eleman;
			System.out.println(data+"kuyruğa ilk eleman olarak eklendi");
		}
		else {
			rear.next=eleman;
			rear=eleman;
			System.out.println(data+"kuyruğa ilk eleman eklendi");
		}
		cnt++;
	}
	void sil() {
		if(isEmpty()) {
			System.out.println("kuyruk boş silinecek eleman bulunamadı");
		}
		else {
			System.out.println(front.data+" silindi");
			front=front.next;
			cnt--;
		}
	}
	void print() {
		if(isEmpty()) {
			System.out.println("kuyruk boş");
		}
		else {
			node temp=front;
			System.out.println("bas<-");
			while(temp!=null) {
				System.out.print(temp.data+"<-");
				temp=temp.next;
			}
			System.out.print(" son");
		}
	}
	boolean isEmpty() {
		return cnt==0;
	}
	boolean isFull() {
		return cnt==size;
	}
}

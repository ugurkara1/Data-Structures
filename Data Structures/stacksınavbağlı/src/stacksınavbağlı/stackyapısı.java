package stacksınavbağlı;

public class stackyapısı {
	int size;
	int cnt;
	node top;
	public stackyapısı(int size) {
		this.size=size;
		cnt=0;
	}
	void push(int data) {
		node eleman=new node(data);
		if(isFull()) {
			System.out.println("stack dolu ekleme yapılamadı");
		}
		else {
			if(isEmpty()) {
				top=eleman;
				System.out.println(top.data+"stacke ilk eleman eklendi");
			}
			else {
				eleman.next=top;
				top=eleman;
				System.out.println(top.data+"stacke eklendi");
			}
			cnt++;
		}
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("stack boş");
		}
		else {
			System.out.println(top.data+"stackten çıkartıldı");
			top=top.next;
			cnt--;
		}
	}
	void yazdir() {
		if(isEmpty()) {
			System.out.println("stackdeki veriler boş yazdırılacak birşey yok");
		}
		else {
			node temp=top;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		System.out.println("/n");
	}
	private boolean isEmpty() {
		return cnt==0;
	}
	private boolean isFull() {
		return cnt==size;
	}
	
	
}

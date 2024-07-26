package veriyapılarıkuyrukbagıl;


public class kuyruk {
	node front;
	node rear;
	int cnt;
	int size;
	public kuyruk(int size) {
		this.size=size;
		cnt=0;
		front=null;
		rear=null;
	}
	void ekle(int data) {
		if(dolu()) {
			System.out.println("kuyruk dolu");
		}
		else {
			node eleman=new node(data);
			if(bos()) {
				front=eleman;
				rear=eleman;
				System.out.println(data+"kuyruğa ilk eleman eklendi");
			}
			else {
				rear.next=eleman;
				rear=rear.next;
			}
			cnt++;
		}
	}
	private boolean dolu() {
		return size==cnt;
	}
	void sil() {
		if(bos()) {
			System.out.println("kuyruk boş");
		}
		else {
			System.out.println(front.data+"silindi");
			front=front.next;
			cnt--;
		}
	}
	private boolean bos() {
		return cnt==0;
	}
	void print() {
		if(bos()) {
			System.out.println("kuyruk boş");
		}
		else {
			node temp=front;
			System.out.println("bas<-");
			while(temp!=null) {
				System.out.println(temp.data+"<-");
				temp=temp.next;
			}
			System.out.println("son");
		}
	}
}

package ciftyönlübağlilist;

public class baglilist {
	node head=null;
	node tail=null;
	void basaekle(int data) {
		node eleman=new node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
			System.out.println(eleman.data+"başa eklendi");
		}
	}
	void sonaekle(int data) {
		node eleman=new node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			tail.next=eleman;
			eleman.prev=tail;
			tail=eleman;
		}
	}
	void arayaekle(int data,int indis) {
		node eleman=new node(data);
		if(head==null && indis==0) {
			head=eleman;
			tail=eleman;
		}
		else if(head.next!=null && indis==0) {
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
		}
		else {
			int n=0;
			node temp=head;
			while(temp!=null) {
				temp=temp.next;
				n++;
			}
			temp=head;
			if(indis>n) {
				tail.next=eleman;
				eleman.prev=tail;
				tail=eleman;
			}
			else{
				int i=0;
				while(i!=indis) {
					temp=temp.next;
					i++;
				}
				eleman.prev=temp.prev;
				temp.prev.next=eleman;
				
				eleman.next=temp;
				temp.prev=eleman;
				
			}
		}
	}
	void bastansil() {
		if(head!=null) {
			if(head.next==null) {
				head=null;
				tail=null;
			}
			else {
				head=head.next;
				head.prev=null;
			}
		}
	}
	void sondansil() {
		if(head!=null) {
			if(head.next==null) {
				head=null;
				tail=null;
			}
			else {
				tail=tail.prev;
				tail.next=null;
			}
		}
	}
	void aradansil(int indis) {
		if(head!=null) {
			if(head.next==null && indis==0) {
				head=null;
				tail=null;
			}
			else if(head.next!=null && indis==0) {
				head=head.next;
				head.prev=null;
			}
			else {
				int n=0;
				node temp=head;
				while(temp!=null) {
					temp=temp.next;
					n++;
				}
				if(indis==n-1) {
					tail=tail.prev;
					tail.next=null;
				}
				else {
					int i=0;
					temp=head;
					while(i<indis) {
						i++;
						temp=temp.next;
					}
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
				}
			}
		}
	}
	void yazdir() {
		node temp=head;
		System.out.print("bas->");
		while(temp!=null) {
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
		System.out.println("son");
	}
	void sondanyazdir() {
		node temp=tail;
		System.out.print("son->");
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.prev;
		}
		System.out.println("->bas");
	}
	void kopyalaYapıstır(node head,node tail,node kopya) {
	    if (kopya == null) {
	        System.out.println("Kopya düğümü null olduğu için işlem yapılamadı.");
	        return;
	    }
		node kopyalanan=head,yapıstırılan=kopya;
		node next=kopya.next,yeni;
		while(kopyalanan!=null) {
			yeni=new node(kopyalanan.data);
			yeni.prev=yapıstırılan;
			yapıstırılan.next=yeni;
			yapıstırılan=yeni;
		}
	    if (next != null) {
	        next.prev = yapıstırılan;
	        yapıstırılan.next = next;
	    } else {
	        System.out.println("Kopya düğümünün next'i null olduğu için sonraki düğüme erişilemedi.");
	    }
	}
}
	


package sınavbaglıliste;

public class liste {
	node head;
	node tail;
	void bas(int data) {
		node eleman=new node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
		}
	}
	void son(int data) {
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
	void yazdir() {
		node temp=head;
		System.out.print("bas->);
		if(temp!=null) {
			System.out.println(temp.data+"->");
		}
		System.out.println("-> son.");
	}
}

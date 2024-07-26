package arayaelemanekle;
public class listyapi {
	note head=null;
	note tail=null;
	void basaekle(int data) {
		note eleman=new note(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			eleman.next=head;
			head=eleman;
			System.out.println("eleman başa eklendi");
		}
	}
	void sonaekle(int data) {
		note eleman=new note(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			tail.next=eleman;
			tail=eleman;
		}
	}
	void arayaekle(int data,int indis) {
		note eleman=new note(data);
		if(head==null && indis==0) {
			head=eleman;
			tail=eleman;
		}
		else if(head.next!=null && indis==0) {
			eleman.next=head;
			head=eleman;
			System.out.println(indis+".sıraya eklendi");
		}
		else {
			int n=0;
			note temp=head;
			note temp2=head;
			while(temp!=null && temp.next!=null) {
				n++;
				temp=temp.next;
			}
			if(n==indis) {
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("eleman eklendi");
			}
			else {
				temp=head;
				temp2=head;
				int i=0;
				while(i<indis) {
					temp2=temp;
					temp=temp.next;
					i++;
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(indis +".sıraya yeni eleman eklendi");
			}
		}
	}
	void bastansil() {
		if(head==null) {
			System.out.println("liste boş silinecek eleman bulunamadı");
		}
		else {
			head=head.next;
			System.out.println("baştaki eleman silindi");
		}
	}
	void sondansil() {
		if(head==null) {
			System.out.println("liste boş silinecek eleman yok");
		}
		else {
			note temp=head;
			note temp2=head;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
			}
			temp2.next=null;
			tail=temp2;
			System.out.println("sondan eleman silindi");
		}
	}
	void aradansil(int indis) {
		if(head==null) {
			System.out.println("liste boş silinecek eleman bulunamadı");
		}
		else {
			int n=0;
			note temp=head;
			note temp2=head;
			while(temp!=null) {
				n++;
				temp2=temp;
				temp=temp.next;
			}
			if(n==indis) {
				temp2.next=null;
				tail=temp2;
				System.out.println("listedki son eleman silindi");
			}
			else {
				temp=head;
				temp2=head;
				int i=0;
				while(i<indis) {
					temp2=temp;
					temp=temp.next;
					i++;
				}
				temp2.next=temp.next;
				
				System.out.println("aradaki nesne silindi");
			}
		}
	}
	void yazdir() {
		if(head==null) {
			System.out.println("liste boş");
		}
		else {
			note temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		}
	}
	void saydır(int x) {
		int sayac=0;
		if(head==null) {
			System.out.println("liste boş saydırılacak eleman yok");
		}
		else {
			note temp=head;
			while(temp!=null) {
				sayac++;
				temp=temp.next;
			}
			System.out.println(sayac+" eleman vardır");
		}
	}
}	
	
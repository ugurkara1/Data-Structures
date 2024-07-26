package stackbaglilist;

public class stackyapısı {
	int size;
	int sayac;
	node top;//head gibi düşünülebilir
	
	public stackyapısı(int size, int sayac) {
		this.size = size;
		sayac=0;
		top=null;
		
	}

	void push(int data) {//ekleme
		node eleman=new node(data);
		if( isFull() ) {
			System.out.println("stack dolu,ekleme yapılamadı");
		}
		else{
			if(isEmpty()) {
				top=eleman;
				System.out.println(top.data+"stacke ilk eleman olarak eklendi");
			}
			else {
				eleman.next=top;
				top=eleman;
				System.out.println(top.data+"stacke eklendi");
			}
			sayac++;
	    }
	 }
	 void pop() { //çıkartma2
		 if(isEmpty()) {
			 System.out.println("stack boş,çıkartacak bişey yok");
		 }
		 else {
			 System.out.println(top.data+"çıkartıldı");
			 top=top.next;
			 sayac--;
		}	 
	 }
	 void print() {
		 if(isEmpty()) {
			 System.out.println("stack boş,yazdırılacak eleman yok");
		 }
		 else {
			 node temp=top;
			 System.out.println("stackdeki veriler \n");
		
			 while(temp!=null) {
				 System.out.println(temp.data);
				 temp=temp.next;
			 }
			 System.out.println("\n");
		 }
	 }
	 boolean isFull() {
		 return sayac==size;
	 }
	 boolean isEmpty() {
		 return sayac==0;
	 }
}
	
	

package bassonekleme;


public class TekYonluListeYapısı {
	dugum head=null;
	dugum tail=null;
	void basaekle(int x) {
		dugum eleman =new dugum();
		eleman.data=x;
		if (head==null) {
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapısı oluşturuldu ilk eleman eklendi");
			
		}else {
			eleman.next=head;
			head=eleman;
			System.out.println("basa eleman eklendi");
		}
	}
	void sonaekle(int x) {
		dugum eleman =new dugum();
		eleman.data=x;
		if (head==null) {
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapısı oluşturuldu ilk eleman eklendi");
			
		}else {
			eleman.next=null;
			tail.next=eleman;//ekleme yaptık
			tail=eleman;//isim güncelliyoruz
			System.out.println("sona eleman eklendi");
		}
	}
	void yazdir() {
		if (head==null) {
			System.out.println("liste yapısı boş");
	
		}
		else {
			dugum temp=head;
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	int sayac=0;
	void saydır(int x) {
		if (head==null) {
			System.out.println("liste yapısı boş");
			
		}
		else {
			dugum temp=head;
			while (temp!=null) {
				sayac++;
				temp=temp.next;
			}
			System.out.println(sayac+" "+"adet eleman vardır");

		}	
	}
}

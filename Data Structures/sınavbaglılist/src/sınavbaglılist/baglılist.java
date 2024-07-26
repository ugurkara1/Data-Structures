package sınavbaglılist;

public class baglılist {
	node head=null;
	node tail=null;
	node temp=null;
	node temp2=null;
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	void ekle(int numara,String ad,String soyad,int vize,int fin) {
		System.out.println("Bilgisayar bölümüne kaydolacak öğrenciler");
		node eleman=new node(numara,ad,soyad, vize,fin);
		if(head==null) {
			head=eleman;
			tail=eleman;
			System.out.println("ilk öğrenci kayıt edildi");
		}
		else {
			eleman.next=head;
			head=eleman;
			System.out.println(numara+"numaralı öğrenci başa kayıt edildi");
		}
	}
	void sil(int numara) {
		if(head==null) {
			System.out.println("liste boş,silinecek öğrenci bulunamadı");
		}
		else {
			System.out.println("silmek istediğiniz öğrencinin numarasını giriniz:");
			if(numara==head.numara && head.next==null) {
				head=null;
				tail=null;
				System.out.println(numara+" numaralı öğrenci silindi,listede öğrenci kalmadı");

			}
			else if(numara==head.numara && head.next!=null) {
				head=head.next;
				System.out.println(numara+" numaralı öğrenci silindi");
			}
			else {
				temp=head;
				temp2=head;
				while(temp.next!=null) {
					if(numara==temp.numara) {
						temp2.next=temp.next;
					}
					temp2=temp;
					temp=temp.next;
				}
				if(numara==temp.numara) {
					temp2.next=null;
					tail=temp2;
					System.out.println(numara+"  numaralı ogrenci silindi");
				}
				
			}
		}
	}
	void yazdır() {
		if(head==null) {
			System.out.println("liste boş");
		}
		else {
			temp=head;
			while(temp!=null) {
				System.out.println(temp.numara+" numaralı öğrenci bilgileri");
				System.out.println("**********************************************");
				System.out.println("ad: "+temp.ad);
				System.out.println("soyad: "+temp.soyad);
				System.out.println("vize: "+temp.vize);
				System.out.println("fin: "+temp.fin);
				System.out.println("ad: "+temp.ad);
				System.out.println("durum: "+temp.durum);
				System.out.println("ortalma : "+temp.ortalama);
				System.out.println("**********************************************");

				temp=temp.next;
			}
		}
	}
	void enbasarılı() {
		if(head==null) {
			System.out.println("liste boş");
		}
		else {
			temp=head;
			double buyuk=temp.ortalama;
			while(temp.next!=null) {
				if(buyuk<temp.ortalama) {
					buyuk=temp.ortalama;
					numara=temp.numara;
					ad=temp.ad;
					soyad=temp.soyad;
					vize=temp.vize;
					fin=temp.fin;
					ortalama=temp.ortalama;
					durum=temp.durum;
				}

				temp=temp.next;
			}
			System.out.println(" en başarılı öğrenci bilgileri");
			System.out.println("**********************************************");
			System.out.println("ad: "+temp.ad);
			System.out.println("soyad: "+temp.soyad);
			System.out.println("vize: "+temp.vize);
			System.out.println("fin: "+temp.fin);
			System.out.println("ad: "+temp.ad);
			System.out.println("durum: "+temp.durum);
			System.out.println("ortalma : "+temp.ortalama);
			System.out.println("**********************************************");
		}
	}
	
	
}

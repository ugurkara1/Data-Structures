package kurskayituygulaması;

import java.util.Scanner;

public class kursstack {
	Scanner scanner =new Scanner(System.in);
	kursnode top;
	int kontenjan;
	int sayac;
	public kursstack(int kontenjan) {
		this.kontenjan = kontenjan;
		sayac=0;
		top=null;
	}
	String tc;
	String ad;
	String soyad;
	String mezunBolum;
	void ekle() {//push
		System.out.println("kursa kayıt edilecek kişi bilgileri");
		System.out.println("tc no:");tc=scanner.nextLine();
		System.out.println("ad:");ad=scanner.nextLine();
		System.out.println("soyad:");soyad=scanner.nextLine();
		System.out.println("mezun oldugu bolum:");mezunBolum=scanner.nextLine();
		
		kursnode eleman=new kursnode(tc,ad,soyad,mezunBolum);
		if (isFull()) {
			System.out.println("kurs kontenjanı dolu,yeni kayıt alamıyoruz");
		}
		else {
			if(isEmpty()) {
				top=eleman;
				System.out.println(top.tc+"numaralı kişi kursa ilk kayıt olarak eklendi");
			}
			else {
				eleman.next=top;
				top=eleman;
				System.out.println(top.tc+"numaralı kişi kursa ilk kayıt olarak eklendi");
			}
			sayac++;
		}
	}
	void sil() {
		if (isEmpty()) {
			System.out.println("kursta kayıt bulunmamaktadır.");
		}
		else {
			System.out.println(top.tc+"numaralı kişi kursa ilk kayıt olarak silindi");
			top=top.next;
			sayac--;
		}
	}
	void yazdır() {
		if(isEmpty()) {
			System.out.println("kursta kayıt bulunmamaktadır");
		}
		else {
			kursnode temp=top;
			System.out.println("kursta kayıtlı kişi listesi");
			System.out.println("TCno\tAd\tSoyad\tMezunBolum");

			while(temp!=null) {
				System.out.println(temp.tc+"\t"+temp.ad+"\t"+temp.soyad+"\t"+temp.mezunBolum);

				temp=temp.next;
			}
		}
	}
	void ensonkayit() {
		if(isEmpty()) {
			System.out.println("kursta kayıtlı kimse bulunamamaktadır");

		}else {
			System.out.println(top.tc+"\t"+top.ad+"\t"+top.soyad+"\t"+top.mezunBolum);

		}
	}
	void kalankontenjansys() {
		System.out.println("toplam kayıtlı kişi sayısı:"+sayac);
		System.out.println("kalan kontenjan sayısı:"+(kontenjan-sayac));

	}
	 private boolean isEmpty() {
		return sayac==0;
	}
	private boolean isFull() {
		return sayac==kontenjan;
	}
	
}

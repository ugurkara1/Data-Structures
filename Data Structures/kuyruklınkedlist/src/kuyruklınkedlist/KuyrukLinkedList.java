package kuyruklınkedlist;
import java.util.LinkedList;
public class KuyrukLinkedList {
	LinkedList<Eleman> kuyruk;
	public KuyrukLinkedList() {
		kuyruk=new LinkedList<>();
	}
	public void kuyrukekle(Eleman yeniEleman) {
		kuyruk.addLast(yeniEleman);
	}
	public void kuyruktansil() {
		if(kuyruk.isEmpty()) {
			System.out.println("kuyruk boş");
		}
		else {
			Eleman silinenEleman=kuyruk.removeFirst();
			System.out.println("kuyruktan silinen kişi:"+silinenEleman.ad+" "+silinenEleman.soyad);
			System.out.println("silme işlemi tamamlanmıştır");
		}
	}
	public int kuyrukElemanSayisi() {
		return kuyruk.size();
	}
	public void kuyruktanAra(String arananİsim) {
		int index=1;
		boolean bulundu=false;
		for(Eleman eleman:kuyruk) {
			if(eleman.ad.equals(arananİsim)) {
				System.out.println("Aranan isim kuyruğun"+index+" .sırasındadır");
				bulundu=true;
				break;
			}
			index++;
		}
		if(!bulundu) {
			System.out.println("kuyrukta aranan isim"+arananİsim+" bulunamadı");
		}
	}
	public void kuyruklistele() {
		if(kuyruk.isEmpty()) {
			System.out.println("kuyruk boş");
		}
		else {
			for(Eleman eleman:kuyruk) {
				System.out.println("Ad:"+eleman.ad+" ,Soyad:"+eleman.soyad+",Doğum tarihi:"+eleman.dogumt+",Telefon numarası:"+eleman.tel);
			}
		}
	}
}

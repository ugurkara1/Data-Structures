package hashtable;

public class hash {
	node dizi[];
	int size;
	public hash(int size) {
		this.size=size;
		dizi=new node[size];
		for(int i=0;i<size;i++) {
			dizi[i]=new node();
		}
	}
	int indexuret(int key) {
		return key%size;
	}
	void ekle(int key,String isim) {
		int index=indexuret(key);
		node eleman=new node(key,isim);
		node temp=dizi[index];
		while(temp.next!=null) 
			temp=temp.next;
		temp.next=eleman;
		System.out.println(eleman.isim+" eklendi");
	}
	void sil(int key) {
		boolean sonuc=false;
		//tek düğümü olan indeksleri siler
		int indis=indexuret(key);
		node temp=dizi[indis];
		node temp2=dizi[indis];
		if(temp.next==null) {
			System.out.println(key+" numaralı kayıt yok");
			sonuc=true;
		}
		else if(temp.next.next==null && temp.next.key==key) {
			System.out.println(temp.next.isim+" bu kısımdaki son kişi olan silindi");
			temp.next=null;
			sonuc=true;
		}
		else { //aradan düğüm siler
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
				if(temp.key==key) {
					sonuc=true;
					System.out.println(temp.isim+" silindi");
					temp2.next=temp.next;
				}
			}
		}
		if(sonuc==false) {
			System.out.println(key+" numaralı kayıt bulunamadı");
		}
	}
	void yazdır() {
		for(int i=0;i<size;i++) {
			node temp=dizi[i];
			System.out.print("Dizi["+i+"]->");
			if(temp.next!=null) {
				while(temp.next!=null) {
					System.out.print(temp.next.key+" - "+temp.next.isim+" ->");
					temp=temp.next;
				}
			}
			System.out.println();
		}
	}
}

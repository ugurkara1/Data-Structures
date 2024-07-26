package hashogrencikayıt;
public class hash {
	ogrenci dizi[];
	int size;
	public hash(int size) {
		this.size=size;
		dizi=new ogrenci[size];
		for(int i=0; i<size; i++) {
			dizi[i]=new ogrenci();
		}
	}
	int indexuret(int numara) {
		return numara % size;
	}
	void ekle(int numara,String ad,int ort) {
		int indis=indexuret(numara);
		ogrenci ogr=new ogrenci(numara,ad, ort);
		ogrenci temp=dizi[indis];
		while(temp.next!=null)
			temp=temp.next;
				
		temp.next=ogr;
		System.out.println(ad+" eklendi");
	}
	void sil(int numara) {
		int indis=indexuret(numara);
		ogrenci temp=dizi[indis];
		ogrenci temp2=dizi[indis];
		if(temp.next==null) {
			System.out.println(numara+" numaralı kayıt yok");
		}
		else if(temp.next.next==null && temp.next.numara==numara) {
			System.out.println(temp.next.ad + " bu kısımdaki son kişi olan silindi");
			temp.next=null;
		}
		else { //aradan düğüm siler
			while(temp.next!=null) { 
				temp2=temp;
				temp=temp.next;
				if(temp.numara==numara) {
					System.out.println(temp.ad+" silindi");
					temp2.next=temp.next;
				}
			}
		}
	}
	void yazdır() {
		System.out.println("numara\t"+"ad\t"+"ort\t"+"durum\t");

		for(int i=0;i<size;i++) {
			ogrenci temp=dizi[i];
			while(temp.next!=null) {
				System.out.println(temp.next.numara+"\t"+temp.next.ad+"\t"+temp.next.ort+"\t"+temp.next.durum);
				temp=temp.next;
			}
		}
	}
	void ara(int numara) {
		boolean sonuc=false;
		int indis=indexuret(numara);
		ogrenci temp=dizi[indis];
		while(temp.next!=null) {
			if(temp.next.numara==numara) {
				sonuc=true;
				System.out.println(numara+" numaralı ögrenci bilgileri");
				System.out.println("ad:"+" "+temp.next.ad);
				System.out.println("ortalama:"+" "+temp.next.ort);
				System.out.println("durum:"+" "+temp.next.durum);
				break;
			}
			temp=temp.next;
		}
		if(sonuc==false) 
			System.out.println(numara+" numaralı ögrenci kaydı yok");
	}
	
}

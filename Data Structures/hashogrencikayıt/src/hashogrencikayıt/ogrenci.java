package hashogrencikayıt;

public class ogrenci {
	int numara;
	String ad;
	int ort;
	String durum;
	ogrenci next;
	public ogrenci() {
		next=null;
	}
	public ogrenci(int numara, String ad, int ort) {
		super();
		this.numara = numara;
		this.ad = ad;
		this.ort = ort;
		this.durum = ort<50 ? "kaldı" :"geçti";
		next=null;
	}

}

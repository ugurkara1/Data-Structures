package kurskayituygulaması;

public class kursnode {
	String tc;
	String ad;
	String soyad;
	String mezunBolum;
	kursnode next;
	public kursnode(String tc, String ad, String soyad, String mezunBolum) {
		this.tc = tc;
		this.ad = ad;
		this.soyad = soyad;
		this.mezunBolum = mezunBolum;
		next=null;
		
	}
	
}

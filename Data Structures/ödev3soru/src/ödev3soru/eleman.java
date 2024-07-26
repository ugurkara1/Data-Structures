package ödev3soru;

public class eleman {
	String ad;
	String soyad;
	int dt;
	String telno;
	eleman next;
	public eleman(String ad, String soyad, int dt, String telno) {
		this.ad = ad;
		this.soyad = soyad;
		this.dt = dt;
		this.telno = telno;
		next=null;
	}
	

}

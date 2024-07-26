package pideciuygulaması;

public class nodepide {
	String isim;
	int ücret;
	int adet;
	nodepide next;
	public nodepide(String isim, int adet) {
		this.isim = isim;
		this.adet = adet;
		ücret=adet*4;
		next=null;
		
	}
	
}

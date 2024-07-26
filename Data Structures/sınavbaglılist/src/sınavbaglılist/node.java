package sınavbaglılist;

public class node {
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	node next;
	public node(int numara, String ad, String soyad, int vize, int fin) {
		this.numara = numara;
		this.ad = ad;
		this.soyad = soyad;
		this.vize = vize;
		this.fin = fin;
		ortalama=vize*0.4+fin*0.6;
		if (ortalama>=50) {
			durum="geçti";
		}
		else {
			durum="kaldı";
		}
	}
	
}

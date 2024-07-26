package ödev2soru;

public class Eleman {
	private String adsoyad;
	private String dogumtarihi;
	private String telefonnumarası;
	public Eleman(String adsoyad,String dogumtarihi,String telefonnumarası) {
		this.adsoyad=adsoyad;
		this.dogumtarihi=dogumtarihi;
		this.telefonnumarası=telefonnumarası;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public String getDogumtarihi() {
		return dogumtarihi;
	}
	public String getTelefonnumarası() {
		return telefonnumarası;
	}
}

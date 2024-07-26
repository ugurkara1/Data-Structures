package ödev46;

public class Dugum {
	int veri;
	Dugum sol;
	Dugum sag;
	public Dugum(int veri) {
		this.veri=veri;
		this.sol=null;
		this.sag=null;
	}
	public void ekle(int yeniVeri) {
		if(yeniVeri<this.veri) {
			if(this.sol==null) {
				this.sol=new Dugum(yeniVeri);
			}
			else {
				this.sol.ekle(yeniVeri);
			}
		}
		else if(yeniVeri>this.veri) {
			if(this.sag==null) {
				this.sag=new Dugum(yeniVeri);
			}
			else {
				this.sag.ekle(yeniVeri);
			}
		}
	}
	public Dugum sil(int silinecekVeri) {
        if (silinecekVeri < this.veri) {
            if (this.sol != null) {
                this.sol = this.sol.sil(silinecekVeri);
            }
        } else if (silinecekVeri > this.veri) {
            if (this.sag != null) {
                this.sag = this.sag.sil(silinecekVeri);
            }
        } else {
            // Silinecek düğümü bulduk.
            if (this.sol == null) {
                return this.sag;
            } else if (this.sag == null) {
                return this.sol;
            }
            // İki çocuğu olan durum
            this.veri = this.sag.enKucukDugum().veri;
            this.sag = this.sag.sil(this.veri);
        }
        return this;
    }

    public Dugum enKucukDugum() {
        if (this.sol == null) {
            return this;
        } else {
            return this.sol.enKucukDugum();
        }
    }

    public void araGezinti() {
        if (this.sol != null) {
            this.sol.araGezinti();
        }
        System.out.print(this.veri + " ");
        if (this.sag != null) {
            this.sag.araGezinti();
        }
    }
}
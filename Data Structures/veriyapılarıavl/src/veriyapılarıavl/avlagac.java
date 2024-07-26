package veriyapılarıavl;

import java.util.ArrayList;

public class avlagac {
	avldugum kok;
	//avl elemanları diziye ekle
    ArrayList<Integer> avlElemanlariDiziyeEkle() {
        ArrayList<Integer> liste = new ArrayList<>();
        araGezintiDiziyeEkle(kok, liste);
        return liste;
    }
	avldugum ekle(avldugum kok,int icerik) {
		if(kok==null) {
			return new avldugum(icerik);
		}
		else if(kok.icerik>icerik) {
			kok.sol=ekle(kok.sol,icerik);
		}
		else if(kok.icerik<icerik) {
			kok.sag=ekle(kok.sol,icerik);
		}
		//2 dugum boyunu guncelle
		kok.boy=1+max(boy(kok.sol),boy(kok.sag));
		//denge degerini al
		int denge=denge(kok);
		if(denge==2 && icerik<kok.sol.icerik) {
			return sagRotasyon(kok);
		}
		if(denge==-2 && icerik>kok.sag.icerik) {
			return solRotasyon(kok);
		}
		if(denge==-2 && icerik<kok.sag.icerik) {
			System.out.println("SAĞ SOL rotasyon");
			kok.sag=sagRotasyon(kok.sag);
			return solRotasyon(kok);
		}
		if(denge==2 && icerik>kok.sol.icerik) {
			System.out.println("Sol sağ rotasyon");
			kok.sol=solRotasyon(kok.sol);
			return sagRotasyon(kok);
		}
		return kok;
	}
	avldugum solRotasyon(avldugum kok) {
		avldugum y=kok.sag;
		avldugum t2=y.sol;
		System.out.println("sol rotasyon");
		//rotasyon islemi
		y.sol=kok;
		kok.sag=t2;
		//boy güncelleme
		kok.boy=1+max(boy(kok.sol),boy(kok.sag));
		y.boy=max(boy(y.sol),boy(y.sag));
		//döndürme sonucu yeni eleman
		return y;
	}
	avldugum sagRotasyon(avldugum kok) {
		avldugum y=kok.sol;
		avldugum t2=y.sag;
		System.out.println("sağ rotasyon");
		//rotasyon islemi
		y.sag=kok;
		kok.sol=t2;
		//boy güncelleme
		kok.boy=1+max(boy(kok.sol),boy(kok.sag));
		y.boy=max(boy(y.sol),boy(y.sag));
		//dondurme sonucu yeni eleman
		return y;
	}
    void araGezintiDiziyeEkle(avldugum dugum, ArrayList<Integer> liste) {
        if (dugum != null) {
            araGezintiDiziyeEkle(dugum.sol, liste);
            liste.add(dugum.icerik);
            araGezintiDiziyeEkle(dugum.sag, liste);
        }
    }
	int boy(avldugum kok) {
		if(kok==null)
			return 0;
		else
			return kok.boy;
	}
	int max(int a,int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	int denge(avldugum kok) {
		return boy(kok.sol)-boy(kok.sag);
	}
}

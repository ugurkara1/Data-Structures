package veriyapılarıagac;

public class agac {
	dugum kok;
	public agac(){
		kok=null;
	}
	dugum agacara(int eleman) {
		dugum kok;
		while(kok!=null) {
			if(kok.icerik==eleman)
				return kok;
			else
				if(kok.icerik>eleman)
					kok=kok.sol;
				else
					kok=kok.sag;
		}
		return null;
	}
	dugum enkucuk() {
		dugum sonuc=kok;
		while(sonuc.sol!=null)
			sonuc=sonuc.sol;
		return sonuc;
	}
}

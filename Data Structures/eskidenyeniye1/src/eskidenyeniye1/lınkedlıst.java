package eskidenyeniye1;

public class lınkedlıst {
	node bas;
	node son;
	public lınkedlıst() {
		bas=null;
		son=null;
	}
	public boolean dolumu() {
		if(bas!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void basaekle(int sayi) {
		node yeniEleman=new node(sayi);
		if(dolumu()) {
			//liste dolu
			yeniEleman.ileri=bas;	
			bas=yeniEleman;
			
		}
		else {
			//liste boş
			bas=yeniEleman;
			son=yeniEleman;
			
		}
	}
	public void sonaekle(int sayi) {
		node yeniEleman=new node(sayi);
		if(dolumu()) {
			son.ileri=yeniEleman;
			son=yeniEleman;
		}
		else {
			bas=yeniEleman;
			son=yeniEleman;
		}
	}
	public void indekseEkle(int sayi,int indeks) {
		node yeniEleman=new node(sayi);
		if(dolumu()) {
			if(indeks==0) {
				yeniEleman.ileri=bas;	
				bas=yeniEleman;
			}
			else {
				//ortada bi yere ekle
				node isaretci1=null;
				node isaretci2=bas;
				int mevcutindeks=0;
				while(isaretci2!=null && mevcutindeks<indeks) {
					isaretci1=isaretci2;
					isaretci2=isaretci2.ileri;
					mevcutindeks++;
				}
				if(isaretci2==null) {
					//listenin sonuna ekle
					son.ileri=yeniEleman;
					son=yeniEleman;
				}
				else {
					//ortada bir yere ekle
					yeniEleman.ileri=isaretci2;
					isaretci1.ileri=yeniEleman;
				}
			}
		}
		else {
			bas=yeniEleman;
			son=yeniEleman;
		}
	}
	public void bastansil() {
		if(dolumu()) {
			if(bas==son) {
				//listede tek eleman var
				bas=null;
				son=null;
			}
			else {
				node yenibas=bas.ileri;
				bas.ileri=null;
				bas=yenibas;
			}
			
		}
	}
	public void sondansil() {
		if(dolumu()) {
			if(bas==son) {
				//listede tek eleman var
				bas=null;
				son=null;
			}
			else {
				node isaretci=bas;
				while(isaretci.ileri!=son) {
					isaretci=isaretci.ileri;
				}
				isaretci.ileri=null;
				son=isaretci;
			}
			
		}
	}
	public void yazdir() {
		node isaretci=bas;
		while(isaretci!=null) {
			System.out.print(isaretci.sayi+" ");
			isaretci=isaretci.ileri;
		}
	}
}

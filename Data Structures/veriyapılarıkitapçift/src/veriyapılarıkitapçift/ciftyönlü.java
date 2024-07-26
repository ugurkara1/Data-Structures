package veriyapılarıkitapçift;


public class ciftyönlü {
	node bas;
	node son;
	public ciftyönlü() {
		bas=null;
		son=null;
	}
	void basaekle(node yeni) {
		if(bas==null) {
			bas=yeni;
			son=yeni;
		}
		else {
			yeni.ileri=bas;
			bas.geri=yeni;
			bas=yeni;
		}
	}
	void sonaekle(node yeni) {
		if(bas==null) {
			bas=yeni;
			son=yeni;
		}
		else {
			son.ileri=yeni;
			yeni.geri=son;
			son=yeni;
		}
	}
	void arayaekle(node yeni,node once) {
		yeni.ileri=once.ileri;
		yeni.geri=once;
		once.ileri.geri=once;
		once.ileri=yeni;
	}
	void bastansil() {
		if(bas!=null) {
			if(bas.ileri==null) {
				bas=null;
				son=null;
			}
			else {
				bas=bas.ileri;
				bas.geri=null;
			}
		}
	}
	void sondansil() {
		if(bas!=null) {
			if(bas.ileri==null) {
				bas=null;
				son=null;
			}
			else {
				son=son.geri;
				son.geri=null;
			}
		}
	}
	void aradansil(int indis) {
		if(bas!=null) {
			if(bas.ileri==null && indis==0) {
				bas=null;
				son=null;
			}
			else if(bas.ileri!=null && indis==0) {
				bas=bas.ileri;
				bas.geri=null;
			}
			else {
				int n=0;
				node temp=bas;
				while(temp!=null) {
					n++;
					temp=temp.ileri;
				}
				if(indis==n-1) {
					son=son.geri;
					son.ileri=null;
				}
				else {
					temp=bas;
					int i=0;
					while(i<indis) {
						i++;
						temp=temp.ileri;
					}
					temp.ileri.geri=temp.geri;
					temp.geri.ileri=temp.ileri;
				}
			}
		}
	}
}

package veriyapılarıkitapçıkın;

public class cıkın {
	ornek dizi[];
	int ust;
	int N;
	public cıkın(int N) {
		dizi=new ornek[N];
		this.N=N;
		ust=-1;
	}
	ornek ust() {
		return dizi[ust];
	}
	boolean cıkındolu() {
		if(ust==N-1) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean cıkınbos() {
		if(ust==-1) {
			return true;
		}
		
		else {
			return false;
		}
	}
	void cıkınekle(ornek yeni) {
		if(!cıkındolu()) {
			ust++;
			dizi[ust]=yeni;
			System.out.println("cıkınekle():"+dizi[ust]);

		}
	}
	ornek cıkınsil() {
		if(!cıkınbos()) {
			ust--;
			return dizi[ust+1];
		}
		return null;
	}
}

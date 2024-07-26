package ödev41;

public class sabıtdizi {
	private int[] dizi;
	private int boyut;
	public sabıtdizi(int boyut) {
		this.boyut=boyut;
		this.dizi=new int[boyut];
	}
	//basa eleman ekleme
	void basaekle(int eleman) {
		for (int i=boyut-1;i>0;i--) {
			dizi[i]=dizi[i-1];
		}
		dizi[0]=eleman;
	}
	//sona ekleme işlemi
	void sonaekle(int eleman) {
		dizi[boyut-1]=eleman;
	}
	void ortayaekle(int eleman,int index) {
		if(index<0 || index>=boyut){
			System.out.println("geçersiz index");
			return;
		}
		for (int i = boyut-1;i>index;i--) {
			dizi[i]=dizi[i-1];
		}
		dizi[index]=eleman;
	}
	//bastan silme
	void bastansil() {
		for(int i=0;i<boyut-1;i++) {
			dizi[i]=dizi[i+1];
		}
		dizi[boyut-1]=0;
	}
	//ortadan silme
	void ortadansil(int index) {
		if (index<0 || index>=boyut) {
			System.out.println("geçersiz index");
			return;
		}
		for (int i=index;i<boyut -1;i++) {
			dizi[i]=dizi[i+1];
		}
		dizi[boyut-1]=0;
	}
	void sondansil() {
		dizi[boyut-1]=0;
	}
	void DiziYaz() {
        System.out.print("Dizi: ");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        sabıtdizi dizi = new sabıtdizi(5);

        // Başa eleman ekleme
        dizi.basaekle(10);
        dizi.DiziYaz(); // Dizi: 10 0 0 0 0

        // Sona eleman ekleme
        dizi.sonaekle(20);
        dizi.DiziYaz(); // Dizi: 10 0 0 0 20

        // Belirli bir konuma eleman ekleme
        dizi.ortayaekle(15, 2);
        dizi.DiziYaz(); // Dizi: 10 0 15 0 20

        // Başından eleman silme
        dizi.bastansil();
        dizi.DiziYaz(); // Dizi: 0 15 0 20 0

        // Belirli bir konumdaki elemanı silme
        dizi.ortadansil(2);
        dizi.DiziYaz(); // Dizi: 0 15 20 0 0

        // Sondan eleman silme
        dizi.sondansil();
        dizi.DiziYaz(); // Dizi: 0 15 20 0 0
    }
} 

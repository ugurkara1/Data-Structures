package ödev1;

import java.util.Scanner;

public class AnaSinif {
		public String marka;
		public int model;
		public String renk;
		
			
		
		public static void main(String[] args) {
			IkinciSinif[] dizi=new IkinciSinif[10];
			for (int i=0;i<10;i++) {
				System.out.println("bilgi Giriniz!");
				Scanner sayi1 = new Scanner(System.in);
				dizi[i].setbilgi1(sayi1.nextInt());
				
				Scanner sayi2 = new Scanner(System.in);
				dizi[i].setbilgi2(sayi2.nextInt());
				
				Scanner bilgi3 = new Scanner(System.in);
				dizi[i].setbilgi3(bilgi3.nextInt());	

			}
			for(int i = 0; i<10; i++) {
				IkinciSinif iks = dizi[i];
				ikinciSinifDegerYazdir(iks);	
			}
			yazdir(1950);

			
		}
	void method(){
			marka = "Toyota";
			model = 2020;
			renk = "kırmızı";
	}
	void method(String marka,int model,String renk){
			this.marka = marka;
			this.model = model;
			this.renk = renk;
	}	
	static void yazdir(int deger){
		System.out.println(deger);

	}
	static void ikinciSinifDegerYazdir(IkinciSinif iks){
		System.out.println(iks.getbilgi1());
		System.out.println(iks.getbilgi2());
		System.out.println(iks.getbilgi3());

	}
	void IkinciSinifDegerAta(int SinifDeger1, int SinifDeger2, int SinifDeger3) {
		IkinciSinif ikinciSinif = new IkinciSinif();
		ikinciSinif.setbilgi1(SinifDeger1);
		ikinciSinif.setbilgi2(SinifDeger2);
		ikinciSinif.setbilgi3(SinifDeger3);
	}

}

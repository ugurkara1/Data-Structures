package dugumolusturma;

public class Ana {

	public static void main(String[] args) {
		Sinif A =new Sinif(); //bellekte düğüm oluşturduk
		
		Sinif B =new Sinif();

		Sinif C =new Sinif();
		
		A.sayi=11;
		B.sayi=22;
		C.sayi=33;
		
		/*System.out.println(A.sayi); //düğümlere değerleri atıyoruz
		System.out.println(B.sayi);
		System.out.println(C.sayi);*/
		
		A.next=B;
		B.next=C;
		C.next=null;
		
		Sinif temp=A;
		while (temp!=null) {
			System.out.println(temp.sayi);
			temp=temp.next;
		}

	}

}

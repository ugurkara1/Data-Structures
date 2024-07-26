package ödev46;

public class AnaSınıf {

	public static void main(String[] args) {
		Dugum kok = new Dugum(50);
        kok.ekle(30);
        kok.ekle(70);
        kok.ekle(20);
        kok.ekle(40);
        kok.ekle(60);
        kok.ekle(80);

        System.out.println("Ara Gezinti: ");
        kok.araGezinti();

        int silinecekVeri = 30;
        kok = kok.sil(silinecekVeri);
        System.out.println("\n" + silinecekVeri + " silindikten sonraki Ara Gezinti: ");
        kok.araGezinti();
    }

}

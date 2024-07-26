package avlagac;

public class uygulma {

	public static void main(String[] args) {
		avlagac agac = new avlagac();

        agac.kok = agac.ekle(agac.kok, 10);
        agac.kok = agac.ekle(agac.kok, 20);
        agac.kok = agac.ekle(agac.kok, 30);
        agac.kok = agac.ekle(agac.kok, 40);
        agac.kok = agac.ekle(agac.kok, 50);

        System.out.println("Oluşturulan AVL ağacının preorder gezinmesi:");
        agac.preorderGezinme(agac.kok);

	}

}

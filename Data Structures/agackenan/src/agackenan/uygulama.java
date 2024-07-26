package agackenan;

public class uygulama {

	public static void main(String[] args) {
		bst agac=new bst();
		agac.ekle(30);
		agac.ekle(20);
		agac.ekle(15);
		agac.ekle(40);
		agac.ekle(50);
		agac.ekle(45);
		agac.ekle(38);
		agac.ekle(12);
		agac.ekle(18);

		agac.print();
		System.out.println(agac.search(12));;

	}

}

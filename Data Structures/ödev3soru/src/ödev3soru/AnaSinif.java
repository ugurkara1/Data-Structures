package ödev3soru;
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int secim =-1,n;
		System.out.println("kuyruk yapısının eleman sayısı:");n=scanner.nextInt();
		KuyrukLınkedList kuyruk =new KuyrukLınkedList(n);
		while(secim!=0) {
			System.out.println("1-kuyruğa ekle");
			System.out.println("2-kuyrukdan sil");
			System.out.println("3-kuyruk eleman sayısı");
			System.out.println("4-eleman arama");
			System.out.println("5-kuyruk listele");
			System.out.println("0-çıkış");
			scanner.nextLine();
			secim=scanner.nextInt();
			switch(secim) {
			case 1:kuyruk.enQueue();break;
			case 2:kuyruk.deQueue();break;
			case 3:kuyruk.sayısı();break;
			case 4:kuyruk.elemanarama(2);break;
			case 5:kuyruk.print();break;
			case 0:System.out.println("çıkış yaptınız");break;
			default: System.out.println("hatalı işlem");
			}
		
		}
	}
		
}


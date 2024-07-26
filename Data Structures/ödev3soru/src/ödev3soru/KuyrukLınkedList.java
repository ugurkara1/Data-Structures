package ödev3soru;
import java.util.Scanner;

public class KuyrukLınkedList {
	Scanner scanner=new Scanner(System.in);
	eleman front;
	eleman rear;
	eleman temp;
	eleman temp2;
	eleman isim;
	int size;
	int cnt;
	public KuyrukLınkedList(int size) {
		this.size = size;
		cnt=0;
		front=null;//bas
		rear=null;//son
	}
	String ad;
	String soyad;
	int dt;
	String telno;
	
	void enQueue() { //ekleme
		if(isFull()) {
			System.out.println("kuyruk sırası dolu");
		}
		else {
			System.out.println("ad:"); ad=scanner.nextLine();
			System.out.println("soyad:"); soyad=scanner.nextLine();
			System.out.println("dogum tarihi:"); dt=scanner.nextInt();
			scanner.nextLine();
			System.out.println("telefon numarası:"); telno=scanner.nextLine();
			eleman Eleman=new eleman(ad,soyad,dt,telno);
			if(isEmpty()) {
				front=Eleman;
				rear=Eleman;
				System.out.println("kuyruk yapısı oluşturuldu ve ilk eleman eklendi");
				
			}
			else {
				rear.next=Eleman;
				rear=Eleman;
				System.out.println(rear.ad+" "+"elemanı eklendi");
			}
			cnt++;
			
		}
		
	}
	
	void deQueue() {//çıkarma
		if(isEmpty()) {
			System.out.println("kuyruk yapısında silinecek eleman bulunmamaktadır.");
		}
		else {
			System.out.println(front.ad+" "+ "kuyruktan silindi ");
			front=front.next;
		}
	}
	void print() {
		if(isEmpty()) {
			System.out.println("kuyruk boş");
		}
		else {
			eleman temp=front;
			while(temp!=null) {
				System.out.print(temp.ad +" "+temp.soyad+" "+temp.dt+" "+temp.telno+"  <-");
				temp=temp.next;
			}
		}
	}
	void sayısı() {
		if(isEmpty()) {
			System.out.println("kuyruk boş");
		}
		else {
			eleman temp=front;
			while(temp!=null) {
				temp=temp.next;
			}
			System.out.println(cnt+" " +"kuyruk eleman sayısı");
		}
	}
	void elemanarama(int sayac) {
				if(isEmpty()) {
					System.out.println("kuyruk boş");
				}
				else {
					eleman temp=front;
					int indis=0;
					while(temp!=null && !(indis>sayac)) {
						if( indis==sayac) {
							System.out.print(temp.ad +" "+temp.soyad+" "+temp.dt+" "+temp.telno+"  <-");
							break;
						}
						else {
							temp=temp.next;
							indis++;
						}
					}
					if(temp==null) {
						System.out.println("aradığınız eleman bulunmamaktadır");
					}
				}
	}

	
	
	private boolean isEmpty() {
		return cnt==0;
	}

	private boolean isFull() {
		return cnt==size;
	}
	
}

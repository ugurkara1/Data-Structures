package bagliliste1;

public class liste {
	not head=null;
	not tail=null;
	void ekle(int x) {
		
		not Eleman =new not();
		Eleman.data=x;
		Eleman.ileri=null;		
		if (head==null) {
			head=Eleman;
			tail=Eleman;
			System.out.println("liste oluşturuldu ve ilk düğüm eklendi");
		}
		else {
			tail.ileri=Eleman; //son elemanın devamına ekledik
			tail=Eleman;
			System.out.println("Listenin sonuna bir eleman ekledik");
			
		}
		
	}
	void yazdır() {
		if (head==null) {
			System.out.println("liste yapısı boş");
			
		}
		else {
			not temp=head;
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.ileri;
				
			}
		}	
	}
}

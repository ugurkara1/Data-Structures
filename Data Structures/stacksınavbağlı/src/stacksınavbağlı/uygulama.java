package stacksınavbağlı;

public class uygulama {

	public static void main(String[] args) {
		stackyapısı liste=new stackyapısı(5);
		liste.push(10);
		liste.push(20);
		liste.push(130);
		liste.yazdir();
		liste.push(25);
		liste.push(35);
		liste.push(40);
		liste.pop();
		liste.yazdir();
	}

}

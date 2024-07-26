package ödev44;

public class terscevir3 {
	private static void reverse(char[] str, int bas, int son) {
		if(bas>=son) {
			return;
		}
		char temp=str[bas];
		str[bas]=str[son];
		str[son]=temp;
		
		reverse(str,bas+1,son-1);
	}


	public static void main(String[] args) {
		String giris="bilgisayar mühendisliği";
		char[] chardizi = giris.toCharArray();
		reverse(chardizi, 0, chardizi.length - 1);
		 System.out.println("Ters Çevrilen : " + new String(chardizi));
	}
}
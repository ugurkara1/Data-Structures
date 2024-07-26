package ödev43;

public class GCD {
	private static int bulGCD(int x,int y) {
		if(y==0) {
			return x; //bölen sıfırsa diğer sayı obebtir
		}
		else {
			return bulGCD(y,x%y);
		}
	}
	public static void main(String[] args) {
		int sayi1=60;
		int sayi2=25;
		int obeb=bulGCD(sayi1,sayi2);
		System.out.println("OBEB(" + sayi1 + ", " + sayi2 + ") = " + obeb);
	}
}

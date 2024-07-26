package ödev45;

public class Pascal {
	public int rePascal(int satir,int sutun) {
		if(sutun==0 || sutun==satir) {
			return 1;
		}
		else {
			return rePascal(satir-1,sutun-1)+rePascal(satir-1,sutun);
		}
	}
	public static void main(String[] args) {
		Pascal psc=new Pascal();
		for(int sat=0;sat<10;sat++) {
			System.out.println();
		for(int sut=0;sut<sat+1;sut++)
			System.out.print(psc.rePascal(sat, sut) + " ");
		}
	}

}

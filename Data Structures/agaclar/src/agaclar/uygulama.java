package agaclar;

public class uygulama {

	public static void main(String[] args) {
		Btree bt=new Btree ();
		bt.kök=bt.insert(bt.kök, 10);
		bt.kök=bt.insert(bt.kök, 15);
		bt.kök=bt.insert(bt.kök, 8);
		bt.kök=bt.insert(bt.kök, 20);
		bt.kök=bt.insert(bt.kök, 4);
		bt.kök=bt.insert(bt.kök, 12);
		
		System.out.println("kökün datası:"+ bt.kök.data);
		System.out.println("kökün sağındaki datası:"+bt.kök.sag.data);
		System.out.println("kökün solundaki datası:"+bt.kök.sol.data);
		System.out.println("kökün solunun solunun  datası:"+bt.kök.sol.sol.data);
		System.out.println("kökün sağının sağı datası:"+bt.kök.sag.sag.data);
		System.out.println("kökün sağının solu datası:"+bt.kök.sag.sol.data);


		
	}

}

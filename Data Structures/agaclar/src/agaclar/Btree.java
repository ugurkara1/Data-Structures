package agaclar;

public class Btree {
	node kök;
	public Btree() {
		kök=null;
		
	}
	node newnode (int data) {
		kök=new node(data);
		System.out.println(data+" agaca eklendi");
		return kök;
		
		
	}
	node insert (node kök,int data) {
		if(kök!=null) {
			if (data<kök.data) 
				kök.sol=insert(kök.sol,data);
			else 
				kök.sag=insert(kök.sag,data);
		}
		else
			kök =newnode(data);
		return kök;
	}
}

package ögrenciagc;

public class node {
	int no,not;
	String ad;
	node left;
	node right;
	public node() {
		no=0;
		not=0;
		ad="";
		left=null;
		right=null;
		
	}
	public node(int no, String ad,int not) {
		this.no = no;
		this.not = not;
		this.ad = ad;
		left=null;
		right=null;
		
	}
	
	
}

package hash2;

public class node {
	int key;
	String isim;
	node next;
	public node() {
		next=null;
	}
	public node(int key,String isim) {
		this.key=key;
		this.isim=isim;
		next=null;
	}
}

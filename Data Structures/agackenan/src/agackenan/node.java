package agackenan;

public class node {
	int data;
	node left;
	node right;
	public node(int data) {
		this.data = data;
		left=null;
		right=null;
		
	}
	@Override
	public String toString() {
		return "node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
}


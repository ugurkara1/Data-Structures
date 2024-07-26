package agackenan;

public class bst {
	node root;
	public bst() {
		root=null;
	}
	public void ekle(int a) {
		root=addRecursive(root,a);
	}
	public node addRecursive(node current,int a) {
		if(current==null) {
			current=new node(a);
			return current;
		}
		else if(current.data>a) {
			current.left=addRecursive(current.left,a);
		}
		else if(current.data<a) {
			current.right=addRecursive(current.right,a);
		}
		return current;
	}
	public void print() {
		printRecursive(root,"");
	}
	public void printRecursive(node current,String indent) {
		System.out.println(indent+current.data);
		if(current.left!=null) {
			printRecursive(current.left,indent+"    ");
		}
		if(current.right!=null) {
			printRecursive(current.right,indent+"    ");

		}
	}
	public node search (int s) {
		return SearchRecursive(root,s);
	}
	public node SearchRecursive(node current,int s) {
		if(current==null || current.data==s)
			return current;
		if (current.data<s) {
			return SearchRecursive(current.right,s);
		}
		return SearchRecursive(current.left,s);
	}
	
}

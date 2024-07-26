 package aramaagacı;

public class uygulama {

	public static void main(String[] args) {
		Tree bst=new Tree();
		bst.root=bst.insert(bst.root, 15);
		bst.root=bst.insert(bst.root, 20);
		bst.root=bst.insert(bst.root, 25);
		bst.root=bst.insert(bst.root, 8);
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 12);
		bst.root=bst.insert(bst.root, 1);
		bst.root=bst.sil(bst.root, 8);
		bst.öngezinti(bst.root);

	}

}

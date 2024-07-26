package agacsilme;

public class uygulama {

	public static void main(String[] args) {
		tree bst=new tree();
		bst.kök=bst.insert(bst.kök, 10);
		bst.kök=bst.insert(bst.kök, 5);
		bst.kök=bst.insert(bst.kök, 15);
		bst.kök=bst.insert(bst.kök, 4);
		bst.kök=bst.insert(bst.kök, 8);
		bst.kök=bst.insert(bst.kök, 12);
		bst.kök=bst.insert(bst.kök, 20);

		bst.inorder(bst.kök);
		//bst.kök=bst.delete(bst.kök, 4);
		//bst.kök=bst.delete(bst.kök, 20);
		bst.kök=bst.delete(bst.kök, 10);

		System.out.println("\nsilme işleminden sonra");
		bst.inorder(bst.kök);
		bst.öngezinti(bst.kök);
		System.out.println("\nkök düğümdeki değer:"+bst.kök.data);
		

	}
	

}

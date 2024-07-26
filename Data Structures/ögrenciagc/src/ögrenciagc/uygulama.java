package ögrenciagc;

public class uygulama {

	public static void main(String[] args) {
		tree ogr=new tree();
		ogr.root=ogr.insert(ogr.root, 10, "ahmet", 100);
		ogr.root=ogr.insert(ogr.root, 15, "mehmet", 100);
		ogr.root=ogr.insert(ogr.root, 5, "ayse", 100);
		ogr.inorder(ogr.root);
		ogr.root=ogr.delete(ogr.root, 15);
		System.out.println("silme işleminden sonra");
		ogr.inorder(ogr.root);
	}

}

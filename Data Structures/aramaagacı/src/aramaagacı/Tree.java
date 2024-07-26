package aramaagacı;

 
public class Tree {
	node root;
	public Tree() {
		root=null;
	}
	node insert(node root,int data) {
		if(root==null) {
			return new node(data);
		}
		else if(root.data>data) {
			root.sol=insert(root.sol,data);
		}
		else if(root.data<data) {
			root.sag=insert(root.sag,data);
		}
		return root;
	}
	void öngezinti(node root) {
		if(root!=null) {
			System.out.println(root.data+" ");
			öngezinti(root.sol);
			öngezinti(root.sag);
		};
	}
	void aragezinti(node root) {
		if(root!=null)	
			aragezinti(root.sol);
			System.out.println(root.data+" ");
			aragezinti(root.sag);
	}
	void sondagezinti(node root) {
		if(root!=null)	
			sondagezinti(root.sol);
			sondagezinti(root.sag);
			System.out.println(root.data+" ");
	}
	node sil(node root,int data) {
		if(root==null) {
			return root;
		}
		else if(root.data>data) {
			root.sol=sil(root.sol,data);
		}
		else if(root.data<data) {
			root.sag=sil(root.sag,data);
		}
		else {
			if(root.sag==null) {
				return root.sol;
			}
			else if(root.sol==null) {
				return root.sag;
			}
			root.data=enkucuk(root.sag);
			root.sag=sil(root.sag,data);
		}
		return root;
	}
	int enkucuk(node root) {
		if(root!=null) {
			if(root.sol==null) {
				return root.data;
			}
			else {
				node sol=root.sol;
				return enkucuk(sol);
			}
		}
		return 0;
	}
	int enbuyuk(node root) {
		if(root!=null) {
			if(root.sag==null) {
				return root.data;
			}
			else {
				node sag=root.sag;
				return enbuyuk(sag);
			}
		}
		return 0;
	}
	int yukseklik(node root) {
		if(root==null) {
			return -1;
		}
		else {
			int left=0;
			int right=0;
			left=yukseklik(root.sol);
			right=yukseklik(root.sag);
			if(left>right) {
				return left+1;
			}
			else {
				return right+1;
			}
		}
	}
	int size(node root) {
		if(root==null) {
			return 0;
		}
		else {
			return size(root.sol)+1+size(root.sag);
		}
	}
}

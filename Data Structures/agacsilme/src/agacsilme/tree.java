package agacsilme;

public class tree {
	node kök;
	int data;
	node sol;
	node sag;

	public tree() {
		kök=null;
		
	}
	node newnode(int x) {
		kök=new node(x);
		return kök;
		
	}
	node insert(node kök,int x) {
		if(kök!=null) {
			if(x<kök.data)
				kök.sol=insert(kök.sol,x);
			else 
				kök.sag=insert(kök.sag,x);
		}
		else 
			kök=newnode(x);
		return kök;
	}
	void inorder(node kök)
	{
		if(kök!=null) {
			inorder(kök.sol);
			System.out.print(kök.data+"  ");
			inorder(kök.sag);
			
		}
	}
	void öngezinti(node kök) {
		if(kök!=null) {
			System.out.print(kök.data+"  ");
			öngezinti(kök.sol);
			öngezinti(kök.sag);
			
		}
	}
	node delete(node kök,int x)
	{
		node t1,t2;
		if(kök==null) 
			return null;
		if(kök.data==x)
		{
			if(kök.sol==kök.sag)//silinecek düğümün altında dal yok
			{
				kök=null;
				return null;
			}
			else if(kök.sol==null)
			{
				t1=kök.sol;
				return t1;
			}
			else if(kök.sag==null)
			{
				t1=kök.sag;
				return t1;
			} 
			else
			{
				t1=t2=kök.sag;
				while(t1.sol!=null) {
					t1=t1.sol;
				}
				t1.sol=kök.sol;
				return t2;
			}
		}
		else 
		{
			if(x<kök.data)
			{
				kök.sol=delete(kök.sol,x);
			}
			else
				kök.sag=delete(kök.sag,x);
		}
		return kök;
	}

}
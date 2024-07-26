package avl3hoca;

public class AvlAgaci {
	AvlDugum kok;
	
	AvlDugum ekle(AvlDugum dugum, int icerik) { 
		  
        /* 1.  normal BST ağacı gibi ekleme yap */
        if (dugum == null) 
            return (new AvlDugum(icerik)); 
  
        if (icerik < dugum.icerik) 
            dugum.sol = ekle(dugum.sol, icerik); 
        else if (icerik > dugum.icerik) 
            dugum.sag = ekle(dugum.sag, icerik); 
        else // Duplicate keys not allowed 
            return dugum; 
  
        /* 2. düğüm boyunu güncelle */
        dugum.boy = 1 + max(boy(dugum.sol), boy(dugum.sag)); 
  
        /* 3. denge değerini al */
        int denge = denge(dugum); 
  
        // 4. rotasyonlar
        //denge fonksiyonu solboy - sagboy işlemi ile hesaplanır.
        //eğer dengesizlik varsa(denge=2 ve denge = -2) 4 durum ortaya çıkacaktır 
        //4.1. Sağ rotasyon
        //denge değeri pozitifse(denge =+2) ve son eklenen düğümün içeriği dengesizliğin belirlendiği düğümün solundaki düğümün içeriğinden küçükse bu rotasyon uygulanır.
        //şart: denge = 2 ve icerik<dugum.sol.icerik
        //Bu durumda son eklenen eleman dengesizliğin belirlendiği düğümün solunun soluna eklenmiştir. bu durumda düğümü sağa doğru döndürerek dengesizlik düzeltilir.
        if (denge == 2 && icerik < dugum.sol.icerik) 
            return sagRotasyon(dugum); 
  
        //4.2. Sol rotasyon
        //denge değeri negatifse(denge=-2) ve son eklenen düğümün içeriği dengesizliğin belirlendiği düğümün sağındaki düğümün içeriğinden büyükse bu rotasyon uygulanır.  
        //şart: denge=-2 ve icerik>dugum.sag.icerik
        //Bu durumda son eklenen eleman dengesizliğin belirlendiği düğümün sağının sağına eklenmiştir. bu durumda düğümü SOLA doğru döndürerek dengesizlik düzeltilir.
        if (denge == -2 && icerik > dugum.sag.icerik) 
            return solRotasyon(dugum); 
  
        //4.3. Sol Sağ rotasyon
        //denge değeri pozitifse(denge=+2) ve son eklenen düğümün içeriği dengesizliğin belirlendiği düğümün solundaki düğümün içeriğinden büyükse bu rotasyon uygulanır.  
        //şart: denge=+2 ve icerik>dugum.sol.icerik
        //Bu durumda son eklenen eleman dengesizliğin belirlendiği düğümün SOLUnun SAĞIna eklenmiştir. bu durumda düğümün sol çocuğuna SOL rotasyon, düğüme SAĞ rotasyon uygulanır. 
        if (denge == 2 && icerik > dugum.sol.icerik) { 
        	System.out.println("SOL SAĞ rotasyon");
            dugum.sol = solRotasyon(dugum.sol); 
            return sagRotasyon(dugum); 
        } 
  
        //4.4. SAĞ SOL rotasyon
        //denge değeri negatifse(denge=-2) ve son eklenen düğümün içeriği dengesizliğin belirlendiği düğümün sağındaki düğümün içeriğinden küçükse bu rotasyon uygulanır.  
        //şart: denge=-2 ve icerik<dugum.sag.icerik
        //Bu durumda son eklenen eleman dengesizliğin belirlendiği düğümün SAĞının SOLuna eklenmiştir. bu durumda düğümün sağ çocuğuna SAĞ rotasyon, düğüme SOL rotasyon uygulanır. 
        if (denge == -2 && icerik < dugum.sag.icerik) { 
        	System.out.println("SAĞ SOL rotasyon");
            dugum.sag = sagRotasyon(dugum.sag); 
            return solRotasyon(dugum); 
        } 
  
        /* hiçbir rotasyon yapılmasıdıysa düğümü dön */
        return dugum; 
    }
	
	int denge(AvlDugum dugum) {
		return boy(dugum.sol) - boy(dugum.sag);
	}
	
	int boy(AvlDugum dugum) {
		if(dugum==null)
			return 0;
		else
			return dugum.boy;
	}
	
	int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	void araGezinti(AvlDugum dugum) {
		if(dugum!=null) {
			araGezinti(dugum.sol);
			System.out.print(dugum.icerik +" / ");
			araGezinti(dugum.sag);
		}
	}
	AvlDugum solRotasyon(AvlDugum dugum) {
		AvlDugum y=dugum.sag;
		AvlDugum t2=y.sol;
		System.out.println("SOL rotasyon");
		//rotasyon işlemi
		y.sol=dugum;
		dugum.sag=t2;
		
		//boy güncellemesi
		dugum.boy=max(boy(dugum.sol), boy(dugum.sag)) + 1;
		y.boy=max(boy(y.sol), boy(y.sag)) +1;
		
		//döndürme sonucu yeni elemanı dön
		return y;
	}
	
	AvlDugum sagRotasyon(AvlDugum dugum) {
		AvlDugum y=dugum.sol;
		AvlDugum t2=y.sag;
		System.out.println("SAG rotasyon");
		//rotasyon işlemi
		y.sag=dugum;
		dugum.sol=t2;
		
		//boy güncelleme
		dugum.boy=max(boy(dugum.sol), boy(dugum.sag)) + 1;
		y.boy=max(boy(y.sol), boy(y.sag)) +1;
		
		// yeni elemanı dön
		return y;
	}
}

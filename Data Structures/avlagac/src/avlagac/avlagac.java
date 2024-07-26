package avlagac;

public class avlagac {
    node kok;

    int yukseklik(node dugum) {
        if (dugum == null)
            return 0;
        return dugum.yukseklik;
    }

    int dengeFaktoru(node dugum) {
        if (dugum == null)
            return 0;
        return yukseklik(dugum.sol) - yukseklik(dugum.sag);
    }
    node sagaDondur(node y) {
        node x = y.sol;
        node T2 = x.sag;

        x.sag = y;
        y.sol = T2;

        y.yukseklik = Math.max(yukseklik(y.sol), yukseklik(y.sag)) + 1;
        x.yukseklik = Math.max(yukseklik(x.sol), yukseklik(x.sag)) + 1;

        return x;
    }
    node solaDondur(node x) {
        node y = x.sag;
        node T2 = y.sol;

        y.sol = x;
        x.sag = T2;

        x.yukseklik = Math.max(yukseklik(x.sol), yukseklik(x.sag)) + 1;
        y.yukseklik = Math.max(yukseklik(y.sol), yukseklik(y.sag)) + 1;

        return y;
    }
    node ekle(node dugum, int veri) {
        if (dugum == null)
            return new node(veri);

        if (veri < dugum.veri)
            dugum.sol = ekle(dugum.sol, veri);
        else if (veri > dugum.veri)
            dugum.sag = ekle(dugum.sag, veri);
        else
            return dugum; // AVL ağaçlarında yinelenen anahtarlar izin verilmez

        dugum.yukseklik = 1 + Math.max(yukseklik(dugum.sol), yukseklik(dugum.sag));
        int denge = dengeFaktoru(dugum);

        // Sol Sol Durumu
        if (denge > 1 && veri < dugum.sol.veri)
            return sagaDondur(dugum);

        // Sağ Sağ Durumu
        if (denge < -1 && veri > dugum.sag.veri)
            return solaDondur(dugum);

        // Sol Sağ Durumu
        if (denge > 1 && veri > dugum.sol.veri) {
            dugum.sol = solaDondur(dugum.sol);
            return sagaDondur(dugum);
        }

        // Sağ Sol Durumu
        if (denge < -1 && veri < dugum.sag.veri) {
            dugum.sag = sagaDondur(dugum.sag);
            return solaDondur(dugum);
        }


        return dugum;
    }

    void preorderGezinme(node dugum) {
        if (dugum != null) {
            System.out.print(dugum.veri + " ");
            preorderGezinme(dugum.sol);
            preorderGezinme(dugum.sag);
        }
    }



}

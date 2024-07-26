package matriscarp;

public class MatrisCarpim extends MatrisIslemleri {
	@Override
	int[][] carp(int[][] matris1,int[][] matris2){
		int satir1=matris1.length;
		int sutun1=matris1[0].length;
		int sutun2=matris2[0].length;
		
		int[][] carpim=new int[satir1][sutun2];
		
		for(int i=0;i<satir1;i++) {
			for(int j=0;j<sutun2;j++) {
				for(int k=0;k<sutun1;k++) {
					carpim[i][j]+=matris1[i][k]*matris2[k][j];
				}
			}
		}
		return carpim;
	}
}

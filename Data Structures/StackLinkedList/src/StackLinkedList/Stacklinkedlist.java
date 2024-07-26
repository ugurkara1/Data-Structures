package StackLinkedList;

import java.util.LinkedList;

public class Stacklinkedlist {
	LinkedList<Eleman> stack;
	public Stacklinkedlist() {
		stack=new LinkedList<Eleman>();
	}
	public void ekle(Eleman yenieleman) {
		stack.push(yenieleman);
	}
	public void sil() {
		if(stack.isEmpty()) {
			System.out.println("kuyruk boş");
		}
		else {
			stack.pop();
		}
	}
	public int elemanSayisi() {
		return stack.size();
	}
	public void ElemanAra(String arananisim) {
        int index = stack.indexOf(arananisim);
        if (index != -1) {
            System.out.println("Aranan isim yığının " + (index + 1) + ". sırasındadır.");
        } else {
            System.out.println("Yığında aranan " + arananisim + " bulunamamıştır.");
        }
	}
	public void listele() {
		if(stack.isEmpty()) {
			System.out.println("yığın boş");
		}
		else {
			for(Eleman eleman:stack) {
				System.out.println(eleman.ad+" "+eleman.soyad+" "+eleman.dogumt+" "+eleman.dogumt+" "+eleman.tel);
			}
		}
	}
}

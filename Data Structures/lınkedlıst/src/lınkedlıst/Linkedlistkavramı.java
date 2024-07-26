package lınkedlıst;

import java.util.LinkedList;

public class Linkedlistkavramı {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(12);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(1,25);
		
		System.out.println(linkedlist);
		linkedlist.set(0, 15);
		System.out.println(linkedlist);


	}

}

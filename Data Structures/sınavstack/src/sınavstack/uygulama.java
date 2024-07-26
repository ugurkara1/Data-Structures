package sınavstack;

public class uygulama {

	public static void main(String[] args) {
		stackyıgın stack=new stackyıgın(5);
		stack.push(5);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(6);
		stack.yazdir();
		System.out.println("çıkan:"+stack.pop());
		System.out.println("çıkan:"+stack.pop());

		

	}

}

package kuyruklınkedlist;

import java.util.LinkedList;

public class kuyruk {
	private LinkedList<Integer> kuyrukbagıl;
	public kuyruk() {
		kuyrukbagıl=new LinkedList<>();
	}
	public void ekle(int item) {
		kuyrukbagıl.addLast(item);
	}
	// Kuyruğun başındaki elemanı kaldırma ve döndürme
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Kuyruk boş.");
        }
        return kuyrukbagıl.removeFirst();
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Kuyruk boş.");
        }
        return kuyrukbagıl.getFirst();
    }

    public boolean isEmpty() {
		return kuyrukbagıl.isEmpty();
	}
    public int size() {
    	return kuyrukbagıl.size();
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş.");
            return;
        }
        System.out.print("Kuyruk: ");
        for (int item : kuyrukbagıl) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
			kuyruk kuyrukbagıl=new kuyruk();
		 	kuyrukbagıl.ekle(10);
		 	kuyrukbagıl.ekle(20);
		 	kuyrukbagıl.ekle(30);

	        // Kuyruktan elemanları çıkarma ve yazdırma
	        System.out.println("Kuyruktan çıkarılan eleman: " + kuyrukbagıl.dequeue());
	        System.out.println("Kuyruktan çıkarılan eleman: " + kuyrukbagıl.dequeue());

	        // Kuyruğun başındaki elemanı gösterme
	        System.out.println("Kuyruğun başındaki eleman: " + kuyrukbagıl.peek());

	        // Kuyruğun boyutunu yazdırma
	        System.out.println("Kuyruğun boyutu: " + kuyrukbagıl.size());
	        kuyrukbagıl.printQueue();

	}

}

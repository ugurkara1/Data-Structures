package StackLinkedList;

import java.util.Scanner;
public class AnaSinif {

	public static void main(String[] args) {
		Stacklinkedlist stack=new Stacklinkedlist();
		Scanner scanner = new Scanner(System.in);		
		int secim;
		do {
			System.out.println("1. stacke ekle");
            System.out.println("2. stackten sil");
            System.out.println("3. stack eleman sayısı");
            System.out.println("4. stackte ara");
            System.out.println("5. stack listele");
            System.out.println("0. Çıkış");
            System.out.print("İstediğiniz komutu giriniz: ");
            secim = scanner.nextInt();
            scanner.nextLine(); // Dummy read to consume the newline
            switch(secim) {
            case 1:
            	System.out.println("stacke eklenecek yeni ad giriniz:");
            	String ad=scanner.nextLine();
            	System.out.println("stacke eklenecek yeni soyad giriniz:");
           		String soyad=scanner.nextLine();
           		System.out.println("stacke eklenecek yeni dogumtarihini giriniz:");
           		String dogumt=scanner.nextLine();
           		System.out.println("stacke eklenecek yeni telefon numarasını giriniz");
           		String tel=scanner.nextLine();
                Eleman yeniEleman = new Eleman(ad, soyad, dogumt, tel);
                stack.ekle(yeniEleman);
                break;
            case 2:
            	stack.sil();
            	break;
            case 3:
                System.out.println("stackde " + stack.elemanSayisi() + " adet eleman vardır.");
                break;
            case 4:
            	System.out.print("Yığında aranacak ismi giriniz: ");
                String arananIsim = scanner.nextLine();
                stack.ElemanAra(arananIsim);
                break;
            case 5:
                stack.listele();
                break;
            default:
                System.out.println("Geçersiz komut!");
            }
	    } while (secim != 0);
	    scanner.close();
	}
	}

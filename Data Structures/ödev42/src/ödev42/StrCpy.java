package ödev42;

public class StrCpy {
	void copyStr(String str1,String str2,int index) {
	//3- Recursion fonksiyonun sonlanma durumunu belirtin
		if(index==str1.length()) {
			System.out.println("kopyalama tamamlandı"+str2);
			return;
		}
	
	//1- Str1 i char dizisine dönüştürün
    	char[] charArray1 = str1.toCharArray();
    //2- Str2 için boç bir char dizisi açın
    	char[] charArray2 = str2.toCharArray();
    //4- Recursion fonksiyonun kural kısmını karakter kopyalama yapacak şekilde döngüsüz yazın.
    	charArray2 = copyCharacters(charArray1, charArray2, index);
    //5- Karekter artımı için index’i sırayla arttırın
    	index++;
    	copyStr(str1, new String(charArray2), index);
	}	
 
   // Döngüsüz karakter kopyalama işlemi
	  private char[] copyCharacters(char[] source, char[] destination, int index) {
	        // Hata kontrolü: Kaynak dizisinin boyutu 0 ise, hata durumunu ele al
	        if (index < destination.length) {
	            destination[index] = source[index];
	        }

	        return destination;
	    }
    public static void main(String[] args) {
        StrCpy st = new StrCpy();
        st.copyStr("merhaba", "", 0);
    }
}

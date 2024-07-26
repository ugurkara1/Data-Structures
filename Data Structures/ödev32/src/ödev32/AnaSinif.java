package ödev32;

public class AnaSinif {

	public static void main(String[] args) {
		 Karma karma = new Karma();

	        // Elemanları ekleme
	        karma.ekle(new Eleman("Ali", "Yılmaz", 123456789));
	        karma.ekle(new Eleman("Ayşe", "Kara", 987654321));
	        karma.ekle(new Eleman("Ceyda", "Demir", 456123789));
	        karma.ekle(new Eleman("Ahmet", "Şahin", 789456123));
	        karma.ekle(new Eleman("Berk", "Yıldız", 654987321));

	        // Tüm Karma Tablo Listeleme
	        karma.tumunuListele();

	        // Tüm Karma Tablo eleman sayısı
	        System.out.println("Karma Tablo Eleman Sayısı: " + karma.elemanSayisi());

	        // Herhangi bir harfe ait Karma Tablo listeleme
	        karma.harfeAitListele('A');

	        // Herhangi bir harfe ait Karma Tablo eleman sayısı
	        System.out.println("A Harfine Ait Eleman Sayısı: " + karma.harfeAitElemanSayisi('A'));

	        // Karma Tablodan eleman silme/çekme
	        karma.sil('A', 0);
	}

}

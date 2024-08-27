import java.util.Scanner;

//1000 ile 2000 arasında klavyeden girilen bir sayının basamak değerleri ortalaması
public class a26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        if (sayi < 1000 || sayi > 2000) {
            System.out.println("1000 ile 2000 arasında bir sayı girin");
        } else {
            int toplam = 0;
            int basamakSayisi = 1;
            int fakeSayi = sayi;
            while (fakeSayi > 0) {
                int basamak = fakeSayi % 10; //sayıyı 10 a böldüğümde kalan sayı son basamağın değerini verir
                toplam = toplam + basamak;//her bir değeri toplam değişkenine eklerim
                fakeSayi = fakeSayi/ 10; //sayıyı her 10'a bölmemde basamak sayısı 1 düşer bunu fakeSAYİ ya atarım
                basamakSayisi++;
            }
            int ortalama = toplam / basamakSayisi;
            System.out.println(ortalama);
        }
    }
}

import java.util.Scanner;

//klavyeden rastgele sayılar giriliyor bu sayılar içinde 10 tane asal sayı girildiğinde bu sayıları diziye atan
//ve dizideki enb sayıyı bulan
public class a23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] asalSayilar = new int[10];  // 10 asal sayıyı saklayacak dizi
        int asalSayac = 0;  // Kaç tane asal sayı bulunduğunu takip eden sayaç

        while (asalSayac < 10) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            // Sayının asal olup olmadığını kontrol etme
            boolean asal = true;
            if (sayi <= 1) {
                asal = false;  // 1 veya daha küçük sayılar asal değildir
            } else {
                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        asal = false;  // Sayı herhangi bir şeye bölünüyorsa asal değildir
                        break;  // Bölünüyorsa daha fazla kontrol etmeye gerek yok
                    }
                }
            }

            // Eğer sayı asal ise diziye ekle
            if (asal) {
                asalSayilar[asalSayac] = sayi;
                asalSayac++;  // Asal sayılar sayacını artır
            }
        }

        // Dizideki en büyük asal sayıyı bulma
        int enBuyuk = asalSayilar[0];
        for (int i = 1; i < asalSayilar.length; i++) {
            if (asalSayilar[i] > enBuyuk) {
                enBuyuk = asalSayilar[i];
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Girilen asal sayılar: ");
        for (int i = 0; i < asalSayilar.length; i++) {
            System.out.print(asalSayilar[i] + " ");
        }
        System.out.println("\nEn büyük asal sayı: " + enBuyuk);

    }
}

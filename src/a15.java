//çarpım sembolü j=1 den 3'e çarpım sembolü k=1 den 4'e j+k
public class a15 {
    public static void main(String[] args) {
        int carpim = 1; // Çarpım işlemi için başlangıç değeri

        // Dış döngü: j'nin 1'den 3'e kadar değer almasını sağlar
        for (int j = 1; j <= 3; j++) {
            int sum = 0; // Her j için toplamı başlat

            // İç döngü: k'nin 1'den 4'e kadar değer almasını sağlar
            for (int k = 1; k <= 4; k++) {
                sum += (j + k); // (j + k) değerlerini topla
            }

            carpim *= sum; // Toplamları çarpım ile çarp
        }

        // Sonucu ekrana yazdır
        System.out.println("İfadenin sonucu: " + carpim);
    }
    }


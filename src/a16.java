//toplam çarpım
public class a16 {
    public static void main(String[] args) {
        int result = 0;  // Toplamı tutacak değişken

        // Dış döngü: i'nin 1'den 2'ye kadar değer almasını sağlar
        for (int i = 1; i <= 2; i++) {
            int product = 1;  // Çarpımı tutacak değişken

            // Orta döngü: j'nin 1'den 3'e kadar değer almasını sağlar
            for (int j = 1; j <= 3; j++) {
                int sum = 0;  // Toplamı tutacak değişken

                // İç döngü: k'nin 1'den 4'e kadar değer almasını sağlar
                for (int k = 1; k <= 4; k++) {
                    sum += (i + j + k);  // (i + j + k) değerlerini topla
                }

                product *= sum;  // Toplamları çarpım ile çarp
            }

            result += product;  // Üçlü çarpım sonucunu toplama ekle
        }

        // Sonucu ekrana yazdır
        System.out.println("İfadenin sonucu f = " + result);
    }
}

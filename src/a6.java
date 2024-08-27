//2-4-8-10-14-16-20-22 giden serinin ilk 100 terimini toplayan java programı
public class a6 {
    public static void main(String[] args) {
        int term = 2; // Serinin ilk terimi
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += term;
            if (i % 2 == 0) {
                term += 2; // Çift indeksler için iki ekle
            } else {
                term += 4; // Tek indeksler için dört ekle
            }
        }

        System.out.println("Serinin ilk 100 teriminin toplamı: " + sum);
    }
}

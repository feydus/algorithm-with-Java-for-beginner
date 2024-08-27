public class a30 {
    public static void main(String[] args) {

        int f = 0;  // Sonuç olarak f değeri başlatılır

        // En dıştaki toplam (i için)
        for (int i = 1; i <= 2; i++) {
            int carpimSonucu = 1;  // Her i için çarpım başlatılır

            // Ortadaki çarpım (j için)
            for (int j = 1; j <= 3; j++) {
                int toplamSonucu = 0;  // Her j için toplam başlatılır

                // En içteki toplam (k için)
                for (int k = 1; k <= 4; k++) {
                    toplamSonucu += (i + j + k);  // (i + j + k) toplanır
                }

                carpimSonucu *= toplamSonucu;  // Toplamlar çarpılır
            }

            f += carpimSonucu;  // Çarpımlar toplanır
        }

        // Sonuç ekrana yazdırılır
        System.out.println("Fonksiyonun sonucu: " + f);
    }
}

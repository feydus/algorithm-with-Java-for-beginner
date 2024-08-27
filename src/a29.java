public class a29 {
    public static void main(String[] args) {
        int carpim = 1;
        for (int i=1; i<=3; i++){
            int toplam =0; //her j için toplamı başlat
            for (int j=1; j<=4; j++){
                toplam += (i+j);
            }
            // Toplamları çarp
            carpim *= toplam;
        }
        System.out.println(carpim);
    }
}

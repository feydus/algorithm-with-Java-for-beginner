import java.util.Random;

//50-9000 arası random sayı oluştur
public class a39 {
    public static void main(String[] args) {
        int sayi = randomSayi(50,9000);
        System.out.println(sayi);
    }
    public static int randomSayi(int min, int max) {
        Random random = new Random();
        return (int) random.nextInt(max - min + 1) + min;
    }
}

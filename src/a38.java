import java.util.Random;

//a-z arası random karakter oluştur
public class a38 {
    public static void main(String[] args) {
        // Rastgele bir karakter oluştur ve ekrana yazdır
        char randomChar = generateRandomCharacter('a', 'z');
        System.out.println("Rastgele karakter: " + randomChar);
    }

    // Belirtilen aralıkta (min ve max dahil) rastgele bir karakter döndüren metot
    public static char generateRandomCharacter(char min, char max) {
        Random random = new Random();
        // min ve max arasındaki rastgele bir karakter oluştur
        return (char) (random.nextInt(max - min + 1) + min);
    }
}

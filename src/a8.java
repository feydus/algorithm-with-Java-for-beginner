//2 boyutlu 6*5 elemanlı karakter dizisi içinde kaç tane kH kaç tane bH olduğnu bulan /random
import java.util.Random;
public class a8 {
    public static void main(String[] args) {
        char[][] array = new char[6][5];
        Random rand = new Random();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        // Diziyi rastgele küçük ve büyük harflerle doldur
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Rastgele küçük veya büyük harf seç
                if (rand.nextBoolean()) {
                    array[i][j] = (char) (rand.nextInt(26) + 'a'); // Küçük harf
                } else {
                    array[i][j] = (char) (rand.nextInt(26) + 'A'); // Büyük harf
                }
            }
        }

        // Küçük ve büyük harfleri say
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (Character.isLowerCase(array[i][j])) {
                    lowerCaseCount++;
                } else if (Character.isUpperCase(array[i][j])) {
                    upperCaseCount++;
                }
            }
        }

        // Diziyi ekrana yazdır
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Küçük harf sayısı: " + lowerCaseCount);
        System.out.println("Büyük harf sayısı: " + upperCaseCount);
    }
}

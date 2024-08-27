//2 boyutlu 6*5 elemanlı karakter dizisi içinde kaç tane kH kaç tane bH olduğnu bulan / klavyeden girilen
import java.util.Scanner;
public class a9 {
    public static void main(String[] args) {
        char[][] array = new char[6][5];
        Scanner scanner = new Scanner(System.in);
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        // Kullanıcıdan diziyi doldurmasını iste
        System.out.println("Lütfen 6x5 boyutunda karakter dizisini giriniz:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.next().charAt(0);
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
        System.out.println("Girilen dizi:");
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

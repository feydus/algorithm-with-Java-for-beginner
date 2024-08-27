import java.util.Scanner;

//klavyeden 10 kez (x,y) ikilileri giriliyor bu (x,y) ikilileri koordinat sisteminde gösterildiğinde orjin noktasına en uzak noktayı (x,y) ikilisini ekrana yazan ...
public class a13 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int maxUzaklik = 0;
        int maxX = 0, maxY = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Koordinat " + (i + 1) + " için x değerini girin: ");
            int x = k.nextInt();
            System.out.print("Koordinat " + (i + 1) + " için y değerini girin: ");
            int y = k.nextInt();


            int uzaklikKaresi = x * x + y * y;


            if (uzaklikKaresi > maxUzaklik) {
                maxUzaklik = uzaklikKaresi;
                maxX = x;
                maxY = y;
            }
        }

        System.out.println("En büyük uzaklık karesi: " + maxUzaklik);
        System.out.println("En büyük uzaklığa sahip koordinatlar: (" + maxX + ", " + maxY + ")");
    }
}

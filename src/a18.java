import java.util.Scanner;

//klavyeden girilen 6*5 iki boyutlu karakter dizisi içerisinde kaç tane küçük harf olduğunu ekrana yazan
public class a18 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int bH = 0;
        int kH = 0;
        char [][] dizi = new char[6][5];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Dizi [" + i + "][" + j + "] için bir karakter girin: ");
                dizi[i][j] = k.next().charAt(0);
            }
        }

        for (int i=0; i<6; i++){
            for (int j=0; j<5; j++){
                if (dizi[i][j] >= 'a' && dizi[i][j] <='z'){
                    kH++;
                }
                if (dizi[i][j] >= 'A' && dizi[i][j] <='Z'){
                    bH++;
                }
            }
        }
        System.out.println(kH);
        System.out.println(bH);


    }
}

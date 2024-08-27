import java.util.Scanner;

//klavyeden girilen sayılar içinde 0 sayısı girildiğinde o ana kadar girilen sayıların toplamı
public class a28 {
    public static void main(String[] args) {
        Scanner k  =new Scanner(System.in);
        int toplam = 0 ;
        for (int i=0; i<10; i++){
            while (true){
                int x = k.nextInt();
                if (x ==0){
                    break;
                }else {
                    toplam += x;
                }
            }
            System.out.println(toplam);
            toplam = 0;
        }
    }
}

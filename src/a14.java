import java.util.Scanner;
//20 elemanlı tam sayı dizisinin en küçük elemanının indisini bulan

public class a14 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int enK=0;
        int [] dizi = new int[5];

        for (int i=0; i<5; i++){
            System.out.println("sayı gir");
            int yy=k.nextInt();
            dizi[i]=yy;
        }
        for (int i=0; i<5; i++){
            if (dizi[i] < 0){
                enK = dizi[i];
            }
        }
        for (int i=0; i< dizi.length; i++){
            if (dizi[i] == enK) {
                System.out.println("en küçüğün yeri : " + i);
            }
        }
    }}

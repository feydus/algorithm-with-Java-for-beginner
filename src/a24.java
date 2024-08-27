import java.util.Scanner;

//klavyeden girilen string dizisi içinde tek karaktere sahip olanları ekrana yazan
public class a24 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String [] dizi = new String[10];
        for (int i=0; i<10; i++){
            String y = k.nextLine();
            dizi[i] = y;

        }
        for (int i = 0 ; i< dizi.length; i++){
            if (dizi[i].length() == 1){
                System.out.print(dizi[i]);
            }
        }

    }
}

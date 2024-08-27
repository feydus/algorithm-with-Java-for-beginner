import java.util.Scanner;

//klvyden girilen stringin boşlukları silip stringi ekrana yazan java
public class a11 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("string giriniz");
        String x = k.nextLine();
        for (int i=0; i<x.length(); i++){
            if (x.charAt(i) != ' '){
                System.out.print(x.charAt(i));
            }

        }
    }
}

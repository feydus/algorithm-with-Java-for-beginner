import java.util.Scanner;

public class a27 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String metin = k.nextLine();
        char xx = ' ';
        String bos = "";
        for (int i=0; i<metin.length(); i++){
            if (xx != metin.charAt(i)){
                bos +=metin.charAt(i);
            }
        }
        System.out.println(bos);
    }
}

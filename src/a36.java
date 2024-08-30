import java.util.Scanner;

//şifre kontrol
public class a36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the password");
        String password = sc.nextLine();
        System.out.println(sifreGecerliMi(password));
    }
    public static boolean sifreGecerliMi (String password) {
        boolean SıfreGecerliMi = true;
        if (password.length() < 8) {
            return SıfreGecerliMi = false;
        }
        int rakamSayisi = 0, harfSayısı = 0, BuyukC = 0, KucukC = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                BuyukC = 1;
            }
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                KucukC = 1;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                rakamSayisi = 1;
            }
        }
        int top = BuyukC + KucukC + rakamSayisi;
        if (top != 3) {
            SıfreGecerliMi = false;
        }
        return SıfreGecerliMi;
    }}

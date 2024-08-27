import java.util.Scanner;

//
public class a25 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String karakter = "!@^#%*&+-";
        int bH=0, kH=0, sayi=0, ozelK = 0, sonuc;
        System.out.println("şifre giriniz");
        String sifre = k.next();
        for (int i=0; i<sifre.length(); i++){
            if (sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9'){
                sayi = 1;
            }
            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z'){
                kH = 1;
            }
            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z'){
                bH = 1;
            }
            for (int j=0; j<karakter.length(); j++){
                if (sifre.charAt(i) == karakter.charAt(j)){
                    ozelK=1;
                }
            }
        }
        sonuc = (bH + kH +sayi+ozelK) * 25;
        System.out.println("sifre gücü "+ sonuc);
    }}

import java.util.Scanner;

//hex to dec : ADF4
public class a35 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("please enter a hex number"); //hex sayı istedim
        String hex = k.nextLine(); //aldım string değişkene atadım
        System.out.println(hex + " sayısının decimal değeri " + donustur(hex)); //değişkeni metota gönderdim

    }
    public static int donustur (String hex){ //parantez içi aldığım değişkenin türü // metot başı döndürdüğüm değerin türü
        int taban = 1 ;
        int decimalDeger = 0;
        for(int i =hex.length()-1; i>=0; i--){
            char hexChar = hex.charAt(i); //stringteki her bir karakteri aldım
            decimalDeger = decimalDeger + taban * hexChartoDecimal(hexChar); //her bir karakteri diğer metota gönderdim //0 + (1*10) ; (1*10) + (16*5) ;
            taban = taban * 16; //16^0 ; 16^1 ; 16^2 ; 16^3
        }
        return decimalDeger; //döndürdüğüm değer
    }
    public static int hexChartoDecimal (char ch){
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }
        else
            return ch - '0';
    }
}

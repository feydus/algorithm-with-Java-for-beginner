import java.util.Scanner;

//klavyeden girilen stringin sesli harfler olmadan ekrana yazan
public class a22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir string al
        System.out.print("Bir string girin: ");
        String input = scanner.nextLine();

        // Sonuç string'i oluştur
        String sonuc = "";

        // Her karakteri kontrol edip sesli harf değilse sonuca ekleyelim
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'a' && c != 'e' && c != 'ı' && c != 'i' && c != 'o' && c != 'ö' && c != 'u' && c != 'ü' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'İ' && c != 'O' && c != 'Ö' && c != 'U' && c != 'Ü') {
                sonuc += c;
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("Sesli harfler olmadan: " + sonuc);
}}

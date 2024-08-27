import java.util.Scanner;

//klavyeden girilen stringten içinde ilk harfi 'a' ve 'A' olanları ekrana yazan , ilk karakteri q girildiği zaman programdan çıkan
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Bir string girin (programdan çıkmak için 'q' yazın): ");
            input = scanner.nextLine();

            // İlk karakter 'q' ise programdan çık
            if (input.length() > 0 && input.charAt(0) == 'q') {
                break; // Döngüden çık
            } else if (input.length() > 0 && (input.charAt(0) == 'a' || input.charAt(0) == 'A')) {
                // İlk karakter 'a' veya 'A' ise ekrana yaz
                System.out.println("Girdiğiniz string: " + input);
            }
        }

        System.out.println("Program sona erdi.");
    }
}

public class a32 {
    // Bir metni tersine çeviren metot
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String originalText = "Java Programming";

        // Metni tersine çevirme metodunu çağırıyoruz
        String reversedText = reverseString(originalText);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Tersine Çevrilmiş Metin: " + reversedText);

    }
}

//iki boyutlu string dizisinde palindrom olan stringleri ekrana yazan java programı
public class a10 {
    public static void main(String[] args) {
        // İki boyutlu dizi tanımlama ve örnek verilerle doldurma
        String[][] array = {
                {"madam", "hello", "racecar"},
                {"level", "world", "deified"},
                {"rotor", "java", "civic"}
        };

        // Palindrom olan dizeleri bul ve ekrana yazdır
        System.out.println("Palindrom olan dizeler:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String str = array[i][j];

                // Palindrom olup olmadığını kontrol et
                boolean isPalindrome = true;
                int left = 0;
                int right = str.length() - 1;

                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome) {
                    System.out.println(str);
                }
            }
        }
    }
}

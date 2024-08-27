//n*n 2 boyutlu bir matrisin transpozesini alan java programı
public class a5 {
    public static void main(String[] args) {

        int n = 3; // Matrisin boyutu (n x n)

        // Örnek bir n x n matris tanımlayalım
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Transpoze matrisin oluşturulması
        int[][] transpoz = new int[n][n];

        // Matrisin transpozesini hesapla
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matrisi ekrana yazdır
        System.out.println("Orijinal Matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoze matrisi ekrana yazdır
        System.out.println("Transpoze Matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class a41 {
    public static void main(String[] args) {
        int matris [][] = {{-4,-2,-3},{5,6,7},{17,10,11}};
        int [] ebDizisi = new int [matris.length];

        for (int i = 0; i < matris.length; i++) {
            ebDizisi[i] = matris[i][0];
            for (int j = 0; j < matris[0].length; j++) {
                if(matris[i][j] > ebDizisi[i])
                    ebDizisi[i] = matris[i][j];
            }
        }

        for (int i = 0; i < ebDizisi.length; i++) {
            System.out.println(ebDizisi[i]);
        }
    }
}

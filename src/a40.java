//transpoz
public class a40 {
    public static void main(String[] args) {
        int [][] c = new int[5][5];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = (int)(Math.random()*100);
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("transpoz matris = ");
        int [][] transpozMatris = transpozOlustur(c);
        for (int i = 0; i < transpozMatris.length; i++) {
            for (int j = 0; j < transpozMatris[0].length; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] transpozOlustur (int[][] matris){
        int [][] transpozMatris = new int[matris.length][matris[0].length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpozMatris[i][j] = matris[i][j];
            }
        }
        return transpozMatris;
    }

}

//2-4-8-16-32-... serisinin ilk 10 elemanının a.o. bulan
public class a21 {
    public static void main(String[] args) {
        int [] dizi = new int[10];
        int ilk = 2;
        int iki;
        dizi [0] = ilk;
        for (int i=1; i<10; i++){
            iki = ilk * 2;
            ilk = iki;
            dizi[i] = ilk;
        }
        int top = 0;
        for (int i = 0 ; i< dizi.length; i++){
            top +=dizi[i];
        }
        int ort = top / dizi.length;
        System.out.println(ort);
    }
}

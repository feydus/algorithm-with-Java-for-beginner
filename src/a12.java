import java.util.Scanner;

//klavyeden rastgele sayılar giriliyor bu sayılar içinde 10 tane asal girildiğinde bu sayıları diziye atan ve en büyük sayıyı ekrana yazan
public class a12 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] dizi = new int[10]; //asal sayıları atama için yeni bir dizi tannımladım
        int asalT = 0; //asalları toplamak için sayaç tanımladım

        while (asalT < 10) { //şartlı sonsuz döngü açıp asalT sayacının 10 dan küçük old kontrol ederek
            int sayi = k.nextInt(); //klavyeden sayı aldım
            boolean asal = true; //boolean değişkeni tanımladım asal olup olmadığını bulmak için

            if (sayi <= 1) { //sayı 1 den küçükse false döndürdüm
                asal = false;
            } else { //değilse sayıyı sayının yarısına kadar olan sayılarla bölüp
                for (int i = 2; i <= sayi / 2; i++) { //bölümünden 0 kalıyorsa asal değildir diyip döngüyü kırdım
                    if (sayi % i == 0) {
                        asal = false;
                        break;
                    }
                }//bir sayının asal olmaması demek 1 den küçük eşit veya 1 veya kendisinden herhangi bir sayıya bölünebilmesi demektir
            }//bu yüzden yukarda hep false döndüm
            //fakat asal değişkeni burda true dönmeye devam ediyor
            if (!asal) {
                // Burada asal olmayan sayılar için bir işlem yapılabilir
                System.out.println(sayi + " asal değil.");
            } else {
                // Asal sayıları burada işliyoruz
                dizi[asalT] = sayi;
                asalT++;
            }

        }
        int enB = dizi[0];
        for (int i=0; i<10; i++ ){
            if (dizi[i] > enB){
                enB=dizi[i];
            }
        }
        System.out.println("en büyük sayı = " + enB );
    }
}


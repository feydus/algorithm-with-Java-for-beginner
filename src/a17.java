//10 elemanlı bir dizi sıralı mı değil mi
public class a17 {
    public static void main(String[] args) {
        int [] dizi = {3, 5, 1,6,2,13,};
        boolean siraliMi = true;
        for (int i=1; i<= dizi.length; i++){
            if (!(dizi[i] > dizi[i-1])){
                siraliMi = false;
                break;
            }
        }
        System.out.println(siraliMi);

    }

}

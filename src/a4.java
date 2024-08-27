//ilk 2 terimi 1 olan Fn  = Fn-1 + Fn-2 fib dizisinin ilk 10 terimini ekrana yazdıran 1,1,2,3,5,8,13,21,34,55
public class a4 {
    public static void main(String[] args) {
        int ilk = 1;
        int iki = 1;
        int next ;
        System.out.println(ilk);
        System.out.println(iki);
        for (int i = 2; i < 10 ; i++){
            next = ilk + iki;
            System.out.println(next);
            ilk = iki;
            iki = next;
        }
    }
}

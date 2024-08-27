public class a2 {
    public static void main(String[] args) {
        int i=10;
        int f = 10 * (++i); //önce artır =11
        int x =10 * i++; //önce çarp sonra artır
        System.out.println(x + " " + i);
    }
}

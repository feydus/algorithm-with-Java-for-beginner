public class a19 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        for (int z = 1; z <= 5; z++) {
            if ((++x > 3) && (++y > 2)) {
                x++;
                y += 5;
                --y;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}

//overloading
public class a37 {
    public static void main(String[] args) {
        System.out.println(mMax(3.4, 2.0, 8.6));
    }

    // max method that takes double parameters
    public static double max(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    // mMax method that finds the max of three doubles
    public static double mMax(double x, double y, double z) {
        return max(max(x, y), z);
    }
}

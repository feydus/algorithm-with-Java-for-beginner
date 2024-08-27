//klavyeden griilen 2string içinde yerleri aynı olmak şartıyla eşit karaktere sahip olanları

import java.util.Scanner;

public class a20 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String x = k.nextLine();
        String y = k.nextLine();
        String bos = "";
        int min;
        if (x.length() <= y.length()){
            min = x.length();
        }else{
            min = y.length();
        }
        for (int i=0; i<min; i++){
            if (x.charAt(i) == y.charAt(i)){
                bos += x.charAt(i);
            }
        }
        System.out.println(bos);
    }
}

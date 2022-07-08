import java.util.Scanner;
import java.lang.Math;

public class java_loops {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}

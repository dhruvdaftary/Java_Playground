import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int n = sc.nextInt();
    int c = 0;
    for (int i = 2; i<=n; i++){
        c = a + b;
        a = b;
        b = c;
    }
        System.out.println(c);
    }
    }

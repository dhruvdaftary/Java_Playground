import java.util.Scanner;
public class String_Double_Int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double num2 = input.nextDouble();
        input.nextLine();
        String str = input.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num);
    }
}

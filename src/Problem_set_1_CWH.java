import java.util.Scanner;
public class Problem_set_1_CWH {
    public static void main(String[] args) {
        //Program to sum 3 numbers
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter first number");
        float n1 = sum.nextFloat();
        System.out.println("Enter second number");
        float n2 = sum.nextFloat();
        System.out.println("Enter third number");
        float n3 = sum.nextFloat();
        System.out.println("The sum of the numbers is: " + (n1+n2+n3));
    }
}

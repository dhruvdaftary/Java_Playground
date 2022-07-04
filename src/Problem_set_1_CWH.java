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

        //Take name from user and greet
        Scanner name = new Scanner(System.in);
        System.out.println("PLease enter your full name");
        String full_name = name.nextLine();
        System.out.println("Hello " + full_name + ", have a good day!");

        // Kilometres to miles conversion
        Scanner conversion = new Scanner(System.in);
        System.out.println("Enter the length in km: ");
        float km = conversion.nextFloat();
        float miles = (float)(0.62137*km);
        System.out.println(km + " km in miles is equal to " + miles +" miles.");

        // To check whether the number entered by user is an integer
        Scanner check_num = new Scanner(System.in);
        System.out.println("Enter an integer");
        boolean check = check_num.hasNextInt();
        if(check){
            System.out.println("The input entered is an integer");
        }
        else{
            System.out.println("The input entered is not an integer");
        }

    }
}

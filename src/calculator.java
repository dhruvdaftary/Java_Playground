import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean value = true;
        while (value){
            Scanner sc = new Scanner(System.in);
            System.out.println("Select your operand (+ - * /) type e to exit: ");
            String oper = sc.next().trim();
            if(oper.equals("+")||oper.equals("-")||oper.equals("*")||oper.equals("/")){
                System.out.println("Enter the first number: ");
                int n1 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int n2 = sc.nextInt();
                switch (oper){
                    case "+" -> System.out.println("The answer is " + sum(n1,n2));
                    case "-" -> System.out.println("The answer is " + subtract(n1,n2));
                    case "*" -> System.out.println("The answer is " + multiply(n1,n2));
                    case "/" -> System.out.println("The answer is " + divide(n1,n2));
                    default -> System.out.println("Wrong operand");}
            }
            else if (oper.equals("e")||oper.equals("E")){
                value=false;
                System.out.println("Exiting...");}
            else{
                System.out.println("Invalid input");
            }
        }
}
static int sum(int n1, int n2){
    return (n1+n2);
}
static int subtract(int n1, int n2){
    return (n1-n2);
}
static int multiply(int n1, int n2){
    return (n1*n2);
}
static int divide(int n1, int n2){
    return (n1/n2);
}
}

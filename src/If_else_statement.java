import java.util.Scanner;
public class If_else_statement {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n%2==0){
            if(2<=n && n<=5){
                System.out.println("Not Weird");
            }
            else if(6<=n && n<=20){
                System.out.println("Weird");
            }
            else if(n>=20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in which occurrences are to be checked: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of which occurrences are to be checked: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = 0;
    while (n != 0){
        temp = n%10;
        if (temp == num){
            count++;
        }
        n = n/10;
    }
        System.out.println("The number of times "+ num +" occurred is " + count);
    }
    }

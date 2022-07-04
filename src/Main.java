import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        float s1 = marks.nextFloat();
        System.out.println("Enter subject 2 marks");
        float s2 = marks.nextFloat();
        System.out.println("Enter subject 3 marks");
        float s3 = marks.nextFloat();
        System.out.println("Enter subject 4 marks");
        float s4 = marks.nextFloat();
        System.out.println("Enter subject 5 marks");
        float s5 = marks.nextFloat();
        float total =(s1 + s2 + s3 + s4 + s5);
        double percentage = total/5.0;
        System.out.println("The percentage obtained is " + percentage +"%");


    }
}
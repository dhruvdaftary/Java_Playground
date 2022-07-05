import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner marks = new Scanner(System.in);
        System.out.println("Enter the maximum marks that can be obtained by student per subject");
        System.out.print("Subject 1: ");
        float max_s1 = marks.nextFloat();
        System.out.print("Subject 2: ");
        float max_s2 = marks.nextFloat();
        System.out.print("Subject 3: ");
        float max_s3 = marks.nextFloat();
        System.out.println("Enter the marks obtained by student per subject");
        System.out.print("Subject 1: ");
        float s1 = marks.nextFloat();
        System.out.print("Subject 2: ");
        float s2 = marks.nextFloat();
        System.out.print("Subject 3: ");
        float s3 = marks.nextFloat();
        float perc_s1 = (float) ((s1*100.00)/max_s1);
        float perc_s2 = (float) ((s2*100.00)/max_s2);
        float perc_s3 = (float) ((s1*100.00)/max_s3);
        System.out.println("Subject 1: " + perc_s1 + " %");
        System.out.println("Subject 2: " + perc_s2 + " %");
        System.out.println("Subject 3: " + perc_s3 + " %");
        if (perc_s1+perc_s2+perc_s3==40 && perc_s1>=33 && perc_s2>=33 && perc_s3>=33){
            System.out.println("The student has passed.");
        }
        else{
            System.out.println("The student has failed.");
        }

    }
}
import java.util.Scanner;
public class java_output_formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] num = new int[3];
        String [] name = new String[3];
        for(int i=0;i<3;i++){
            name[i] =sc.next();
            num[i] =sc.nextInt();
            //Complete this line
        }
        System.out.println("================================");
        for (int i=0;i<3;i++){
            //System.out.print(name[i]);
            System.out.printf("%-14s %03d\n",name[i],num[i]);
        }
        System.out.println("================================");

    }
}

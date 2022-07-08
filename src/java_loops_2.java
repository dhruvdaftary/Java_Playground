import java.util.Scanner;
import java.lang.Math;

public class java_loops_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int [] a = new int[t];
        int [] b = new int[t];
        int [] n = new int[t];
        for(int i=0;i<t;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }

        for (int i=0;i<t;i++){
            int c_not = 0;
            for(int j=0; j<n[i];j++ ){
                int c = (int) Math.pow(2,j);
                System.out.printf("%d ",a[i]+(c*b[i])+c_not);
                c=c*b[i];
                c_not=c_not+c;
                //System.out.print(a[i]+c+" ");
                //System.out.println("\n");
            }
            System.out.print("\n");
        }
    }
}

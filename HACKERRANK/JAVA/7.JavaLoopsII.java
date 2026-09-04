import java.util.Scanner;
import java.lang.Math;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for ( int i=0; i<t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum= a+(int)Math.pow(2, 0)*b;
            System.out.print(sum);
            for( int k=1; k<n; k++ )
            {
                sum=sum+(int)Math.pow(2, k)*b;
                System.out.print(" "+sum);
            }
            System.out.println();
        }

        sc.close();
    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the row num");
        int p=in.nextInt();
        for (int j=0; j<p; j++) {

            for (int n=j; n>=0; n--)
            {
                System.out.print((char)(65+p-n-1)+" ");
            }
            System.out.println();
        }
    }
}

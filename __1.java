import java.util.Scanner;

public class __1 {
    public static void main(String[] args) {

        Scanner n=new Scanner(System.in);
        System.out.println("enter the number of row");
        int p=n.nextInt();
        for (int i = 0; i <p ; i++) {
            for (int j = 0; j < p-i+1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <i+1 ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class jAgged {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];

        Scanner obj = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of row " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = obj.nextInt();
            }
            System.out.println();
        }


        System.out.println("Printing the elements of the jagged array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class num_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int count = 0;
    while (num > 0) {
        int rem = num % 10;
        if (rem == 6) {
            count++;
        }
        num = num / 10;
    }
    System.out.println(count);
}
}

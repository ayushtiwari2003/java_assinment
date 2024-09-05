import java.util.Scanner;

public class threeofsmall {
    public static void main(String[] args) {
        Scanner on=new Scanner(System.in);
        int a  =on.nextInt();
        int b  =on.nextInt();
        int c  =on.nextInt();

int small=a;
if (small>b){
    small=b;
}if(small>c){
    small=c;
        }
        System.out.print("smallest num "+"  "+ small);
    }
}

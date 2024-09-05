import java.util.Scanner;

public class sting_buffer {
    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        String a=in.nextInt();
        StringBuffer str=new StringBuffer("AYUSH");
        str.append(" Tiwari");
        str.insert(3,"Divya");
//        str.replace(5,5,"ayush");


        System.out.println(str);
    }
}

import jdk.dynalink.beans.StaticClass;

public class returnfunction {


    public static void main(String[] args) {

        System.out.println(greet());

    }
    static  String greet(){
        String greeting="how are you";
        return greeting;
    }
}

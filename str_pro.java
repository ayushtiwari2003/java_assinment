public class str_pro {

    public static void main(String[] args) {
        int num=20;
        float price= 75.5f;
        double amount = 145.75;

        String s1=String.valueOf(num);
        String s2=String.valueOf(price);
        String s3=String.valueOf(amount);

        System.out.println(s1+10);
        System.out.println(s2+" Rs");
        System.out.println(s3+" Rupees");
    }
}

public class stri {
    public static void main(String[] args) {
        String str ="abc";
        String reversed="";
        for (int i=str.length()-1;i>=0; i++){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
        if (reversed.equals(str)) {
            System.out.println("palindrome"+str);
        }else{
            System.out.println("not Palindrome"+str);
        }
    }
}

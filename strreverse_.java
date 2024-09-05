public class strreverse {
    public static void main(String[] args) {
        String str="hello";
        String reverse="";

        for (int j=str.length()-1;j>=0; j--){
            reverse +=str.charAt(j);

        }
        System.out.println("original String"+str);
        System.out.println("reverse String:"+str);
    }
}


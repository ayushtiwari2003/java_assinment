public class big_number {
    public static void main(String[] args) {
        double arr[] = {10, 20, 100, 50};
        double big_num;
        big_num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < big_num)
                big_num = arr[i];
        }
        System.out.println("largest number is :"+ big_num);
    }
}

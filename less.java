public class less {
    public static void main(String[] args) {
        int arr[]={1,2,3,0};
        int less_number;
        less_number=arr[0];

        for (int i = 0; i < arr.length; i++) {
if (arr[i] > less_number)
    less_number=arr[i];
        }
        System.out.println(less_number);
    }
}

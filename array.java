import java.util.Scanner;

public class array {

    public static void updatedArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 21, 45, 75 };
        updatedArr(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}

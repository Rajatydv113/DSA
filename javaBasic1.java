import java.util.Scanner;

public class javaBasic1 {

    public static boolean isPalindrome(int n) {
        int org = n;
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;

            rev = rev * 10 + ld;

            n = n / 10;
        }

        if (org == rev) {
            return true;
        }
        return false;
    }
    
    public static void findDigitSum(int n) {
        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum += ld;

            n /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // findAverage(a, b, c);

        findDigitSum(456);
    }
}

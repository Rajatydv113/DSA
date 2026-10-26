import java.util.Scanner;

public class function {

    // function to print hello world
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    // function to return a product of number 
    public static int productNumbers(int a, int b) {
        int prod = a * b;
        return prod;
    }


    // function to calculate sum of two number
    public static int calSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // function to find the factorial of a number
    public static int countFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();
        //  int b = sc.nextInt();

        // //  int sum = calSum(a, b);
        // //  System.out.println(sum);

        //  int product = productNumbers(a, b);
        //  System.out.println(product);

        // int factorial = countFactorial(3);
        // System.out.println(factorial);

        // binomial cofficient
        int n = 10;
        int r = 2;

        int nf = countFactorial(n);
        int rf = countFactorial(r);
        int nmrf = countFactorial(n - r);

        int bf = nf / (rf * nmrf);
        System.out.println(bf);
    }
}

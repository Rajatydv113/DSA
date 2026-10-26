public class pattern {
    public static void main(String[] args) {
        int n = 4;


        // upper diamond
        
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= 2*i - 1; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
        

        // lower diamond
        for (int i = n; i >= 1; i--) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= 2*i - 1; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
        

        
    }
}

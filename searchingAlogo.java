public class searchingAlogo {

    // Linear seach
    public static int linearSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int arr[], int val) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (val == arr[mid]) {
                return mid;
            } else if (val < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // largest element
    public static void largestElement(int arr[]) {
        int larElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larElement) {
                larElement = arr[i];
            }
        }
        System.out.println(larElement);
    }

    // Reverse an array
    public static void reverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            // swapping
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Pairs an array
    public static void pairArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    // Subarray of array
    public static void printSubArray(int arr[]) {
        int maxSum = 0;
        int prefix[] = new int[arr.length];
        // prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = i == 0 ? prefix[0] : prefix[j] - prefix[i - 1];

                maxSum = Math.max(currSum, maxSum);

            }
        }
        System.out.println("Maximum sum is : " + maxSum);
    }
    
    // Kadanes algorithm

    public static void kadane(int arr[]) {
        int cs = 0;
    int ms = Integer.MIN_VALUE;

    for(
            int i = 0; i < arr.length; i++) {
        cs = cs + arr[i];
        if (cs < 0) {
            cs = 0;
        }
        ms = Math.max(ms, cs);
    }
    System.out.println(ms);
    }
    
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        
        kadane(arr);

       

        // int val = 76;

        // // int arrIndex = linearSearch(arr, val);
        // // System.out.println(arrIndex);

        // int arrIndex = binarySearch(arr, val);
        // System.out.println(arrIndex);

        // largestElement(arr);
        // reverseArr(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " , ");
        // }

    }
}

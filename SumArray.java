public class SumArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of even numbers is " + evenSum + " and sum of odd numbers is " + oddSum);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

 


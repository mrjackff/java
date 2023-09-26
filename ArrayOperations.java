public class ArrayOperations {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{-2, -4, -6}, {2, 5, 7}, {8, 4, 6}, {2, 1, 7}};

        // Task 1: Print rows with all negative numbers
        System.out.print("Rows with all negative numbers: ");
        for (int i = 0; i < arr.length; i++) {
            boolean allNegative = true;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                    allNegative = false;
                    break;
                }
            }
            if (allNegative) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Task 2: Print rows with all prime numbers
        System.out.print("Rows with all prime numbers: ");
        for (int i = 0; i < arr.length; i++) {
            boolean allPrime = true;
            for (int j = 0; j < arr[i].length; j++) {
                if (!isPrime(arr[i][j])) {
                    allPrime = false;
                    break;
                }
            }
            if (allPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Task 3: Print rows with all positive even numbers
        System.out.print("Rows with all positive even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            boolean allPositiveEven = true;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <= 0 || arr[i][j] % 2 != 0) {
                    allPositiveEven = false;
                    break;
                }
            }
            if (allPositiveEven) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

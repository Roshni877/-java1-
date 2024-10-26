public class Printevenoddprime {
    public static void main(String[] args) {
        int limit = 50; // Change this to your desired limit

        System.out.println("Even numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nOdd numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nPrime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

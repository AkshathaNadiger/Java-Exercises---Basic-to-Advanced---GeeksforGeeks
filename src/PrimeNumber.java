import java.util.Scanner;

public class PrimeNumber {
    public static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime number");
        } else {

            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println("Not a Prime Number");

                } else {
                    System.out.println("Prime Number");
                }
            }
        }
    }
}

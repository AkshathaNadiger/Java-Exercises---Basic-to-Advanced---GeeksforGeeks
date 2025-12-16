import java.util.Scanner;


public class ArmStrongNumber {

    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        int num, temp,original =0, digit=0, digits = 0 ,sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        original = num;
        temp = num;
         while(temp!=0){
             digits++;
             temp = temp/10;
         }
        temp = num;

        // Step 2: Calculate Armstrong sum
        while (temp != 0) {
            digit = temp % 10;
            sum = sum +power(digit, digits);
            temp = temp/ 10;
        }


        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

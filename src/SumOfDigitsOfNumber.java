import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int n, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate: ");
        n = sc.nextInt();
        while(n!=0){
            sum = sum +n%10;
            n= n/10;
        }
        System.out.println("The sum of digits is:" +sum);
    }
}

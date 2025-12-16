import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n, digit, reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        while(n!=0){
            digit = n%10;
            reverse = reverse*10+digit;
            n =n/10;
        }
        System.out.println("The reversed number is: "+reverse);

    }
}

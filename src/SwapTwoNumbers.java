import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        int a, b, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        a=sc.nextInt();

        System.out.println("Enter the second number");
        b=sc.nextInt();

        System.out.println("Numbers before swapping: ");
        System.out.println("a=" +a + ", b=" +b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers after swapping: ");
        System.out.println("a=" +a + ", b=" +b);

    }
}

import java.util.Scanner;

public class FibonacciSum {

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);

        }

    }


    public static void main(String[] args) {
        int n, sum =0, value;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        System.out.println("Fibonacci of a number is:" + fibonacci(n));

        for(int i=0;i<n;i++){
            value = fibonacci(i);
            System.out.print(value + " ");
            sum +=  value;
        }

        System.out.println("\nSum of first " + n + " Fibonacci numbers = " + sum);
        }
    }




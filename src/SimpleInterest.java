import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        float p,t,r,si;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        p=sc.nextFloat();

        System.out.println("Enter the Time period: ");
        t=sc.nextFloat();

        System.out.println("Enter the Rate of Interest: ");
        r=sc.nextFloat();

        si=(p*t*r)/100;

        System.out.println("Simple Interest for the given data is: "+si);
    }
}

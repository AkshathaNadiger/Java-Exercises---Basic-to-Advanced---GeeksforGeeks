import java.util.Scanner;

public class TableOfANumber {
    public static void main(String[] args) {
        int n, table = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calcuate the table: ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            table = n * i;

            System.out.println(n + "*" + i + "=" + table);
        }
    }
}

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers will be added?");
        int count = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter an integer:");
            int n = scan.nextInt();
            sum += n;
        }
        System.out.println("The sum is " + sum);
        scan.close();
    }
}

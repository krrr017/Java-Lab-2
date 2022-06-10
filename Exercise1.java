import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the start:");
        int startNum = scan.nextInt();
        System.out.println("Input the end");
        int endNum = scan.nextInt();
        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("%d%n", i);
        }
        scan.close();
    }
}

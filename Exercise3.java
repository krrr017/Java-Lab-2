import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            System.out.println(word);
        }
        scan.close();
    }
}

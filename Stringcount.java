import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total number of characters (excluding spaces): " + count);
        scanner.close();
    }
}

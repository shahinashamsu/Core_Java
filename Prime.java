import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
       
        int i, n = 0, flag = 0;

       
        Scanner obj = new Scanner(System.in);

       
        System.out.println("Enter a number:");
        int x = obj.nextInt();

       
        n = x / 2;

        
        for (i = 2; i <= n; ++i) {
            if (x % i == 0) {
                System.out.println("Number is not prime");
                flag = 1;
                break;
            }
        }

        
        if (flag == 0) {
            System.out.println(x + " is a prime number");
        }

        
    }
}


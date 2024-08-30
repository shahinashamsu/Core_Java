import java.util.*;
import static java.lang.System.exit;

public class Calculator {
    public static int add(int a, int b){
        return (a+b);
    }
    public static int subtract(int a, int b){
        return (a-b);
    }
    public static int multiply(int a, int b){
        return (a * b);
    }
    public static int divide(int a, int b){
        return (a/b);
    }
    public static void displayResult(int result){
        System.out.println("Result "+ result);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=0;
        byte ch;
        do{
            System.out.print(" MENU\n ------------ \n  1.Addition \n  2.Subtraction \n  3.Multiplication \n  4.Division \n  5.Exit \n Enter your choice - ");
            ch=sc.nextByte();
            if(ch>0 && ch<5) {
                System.out.println("Enter the first number ");
                n1 = sc.nextInt();
                System.out.println("Enter the second  number ");
                n2 = sc.nextInt();
            }
            switch(ch){
                case 1:
                    displayResult(add(n1,n2));
                    break;
                case 2:
                    displayResult(subtract(n1,n2));
                    break;
                case 3:

                    displayResult(multiply(n1,n2));
                    break;
                case 4:
                    displayResult(divide(n1,n2));
                    break;
                default :
                    System.out.println("Invalid choice");
            }
        }while(ch!=5);
    }
}

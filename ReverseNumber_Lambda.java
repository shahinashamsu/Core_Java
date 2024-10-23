import java.util.Scanner;

interface Reverse{
    int check(int num);
}

class MismatchInputException extends Exception{
    public MismatchInputException(String message){
        super(message);
    }
}

public class ReverseNumber_Lambda {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        try{
        System.out.println("enter a number");
        
        if(!sc.hasNextInt()){
            throw new MismatchInputException("Input is not valid");
        }
        else{
        num=sc.nextInt();
        Reverse rev=(n) ->{
            int reversedNumber=0;
            for(;n!=0;n/=10){
                int digit=n%10;
                reversedNumber=reversedNumber*10 +digit;
            }
            return reversedNumber;
        };
        System.out.println("Reverse is " + rev.check(num));
        }
    }catch (MismatchInputException e){
        System.out.println(e.getMessage());
    }
    
 }
}
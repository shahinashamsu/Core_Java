import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        
        arr.add("a");
        arr.add("m");
        arr.add("n");
        arr.add("o");
        
           System.out.println("Original ArrayList: " + arr);

           arr.add(2, "p");
        
           System.out.println("After adding 'p' at index 2: " + arr);

           arr.remove(1);

           System.out.println("After removing element at index 1: " + arr);
    }
}

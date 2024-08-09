import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

       
        list.add("Ravi");
        list.add("Arjun");
        list.add("Ravi");

       
        Iterator<String> iterator = list.iterator();

       
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

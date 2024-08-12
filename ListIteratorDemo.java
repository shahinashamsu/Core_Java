import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();

       
        list.add("Arun");
        list.add("Ajay");
        list.add("Akash");

       
        System.out.println("Initial list: " + list);

      
        ListIterator itr = list.listIterator();
        while (itr.hasNext()) {
            String name = (String) itr.next();
            if (name.equals("Arun")) {
                itr.remove();
            }
        }

      
        System.out.println("Final list: " + list);
    }
}

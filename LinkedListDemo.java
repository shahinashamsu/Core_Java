import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
      
        LinkedList<Object> list = new LinkedList<>();

       
        list.add(12);
        list.add("manu");
        list.add("ravi");
        
       
        System.out.println("Original LinkedList: " + list);

       
        list.set(0, "hari");
        
        
        System.out.println(list);

       
        list.removeLast();
        
        
        System.out.println("After removing the last element: " + list);
    }
}

package CollectionsExampleCode;
import java.util.HashSet;
public class HashSetExample  {
    public static void main(String[] args) {
       HashSet<String> names = new HashSet<>();
       names.add("Apple");
       names.add("Banana");
       names.add("Orange");
       names.add("Apple"); // Duplicate, will not be added

       for(String na:names){
        System.out.println(na);
       }
    }
}
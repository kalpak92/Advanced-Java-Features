package JavaGenerics;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kalpak
 */
public class GenericsBasic {
    public static void main(String[] args) {
        // Without Generics
        List names = new ArrayList();
        names.add("Kalpak");
        String name = (String) names.get(0);
        System.out.println("First Name: " + name);
        names.add(7);

        // With Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Kalpak");
        String name2 = names2.get(0);   // No explicit type casting required
        System.out.println("First Name: " + name2);
        // names2.add(7);

    }
}

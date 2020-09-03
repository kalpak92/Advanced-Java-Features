package JavaGenerics;

/**
 * @author kalpak
 */
public class Varags {

    // The ... stands for variable length arguments
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        printShoppingList(item1, item2, item3);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }
}


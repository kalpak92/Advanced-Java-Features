package JavaFunctionalProgramming.Lambdas;

/**
 * @author kalpak
 */

public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello: " + name);
            }
        };

        gm.greet("Kalpak");

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello from lambda: " + name);
        };
        gm2.greet("Kalpak");

        MessagePrinter mp = () -> {
            System.out.println("Hello, yet another lambda without taking in any parameters");
        };
        mp.messagePrinter();

        /**
         * Using Method Reference
         */
        Square sq = new Square(10);
        Shapes sp = Square::calculateArea;
        System.out.println("Area: " + sp.getArea(sq));

    }
}

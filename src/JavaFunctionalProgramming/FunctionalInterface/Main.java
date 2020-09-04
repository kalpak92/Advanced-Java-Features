package JavaFunctionalProgramming.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello: " + name);
            }
        };

        gm.greet("Kalpak");
    }
}

package JavaFunctionalProgramming.Lambdas;

/**
 * @author kalpak
 */
public class Square {
    
    int sideLength;
    
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength*sideLength;
    }
}

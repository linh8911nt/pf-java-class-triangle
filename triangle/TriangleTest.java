package triangle;

public class TriangleTest {
    public static void main(String[] args) {
        double sideAB = 5;
        double sideAC = 3;
        double sideBC = 7;

        Triangle triangle = new Triangle(sideAB, sideAC, sideBC);
        System.out.println(triangle);
    }
}

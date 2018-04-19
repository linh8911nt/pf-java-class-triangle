package triangle;

import shape.Shape;

public class Triangle extends Shape {
    private double sideAB = 1;
    private double sideAC = 1;
    private double sideBC = 1;

    public Triangle() {
    }

    public Triangle(double sideAB, double sideAC, double sideBC) {
        this.sideAB = sideAB;
        this.sideAC = sideAC;
        this.sideBC = sideBC;
    }

    public Triangle(String color, boolean filled, double sideAB, double sideAC, double sideBC) {
        super(color, filled);
        this.sideAB = sideAB;
        this.sideAC = sideAC;
        this.sideBC = sideBC;
    }

    public double getArea(double sideAB, double sideAC, double sideBC) {
        double p = (sideAB + sideAC + sideBC) / 2;
        double area = 0;
        if (isTriangle(sideAB, sideAC, sideBC)) {
            area = Math.sqrt(p * (p - sideAB) * (p - sideAC) * (p - sideBC));
        }
        return area;
    }

    public double getPerimeter(double sideAB, double sideAC, double sideBC){
        double perimeter = 0;
        if (isTriangle(sideAB, sideAC, sideBC)){
            perimeter = sideAB + sideAC + sideBC;
        }
        return perimeter;
    }

    public boolean isTriangle(double sideAB, double sideAC, double sideBC) {
        if (checkSideTriangle(sideAB, sideAC, sideBC) && compareSideTriangle(sideAB, sideAC, sideBC)) {
            return true;
        }
        return false;
    }

    public boolean checkSideTriangle(double sideAB, double sideAC, double sideBC) {
        return (sideAB > 0) && (sideAC > 0) && (sideBC > 0);
    }

    public boolean compareSideTriangle(double sideAB, double sideAC, double sideBC) {
        return ((sideAB + sideAC) > sideBC) &&
                ((sideAB + sideBC) > sideAC) &&
                ((sideAC + sideBC) > sideAB);
    }

    public double getSideAB() {
        return sideAB;
    }

    public void setSideAB(double sideAB) {
        this.sideAB = sideAB;
    }

    public double getSideAC() {
        return sideAC;
    }

    public void setSideAC(double sideAC) {
        this.sideAC = sideAC;
    }

    public double getSideBC() {
        return sideBC;
    }

    public void setSideBC(double sideBC) {
        this.sideBC = sideBC;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Triangle {" +
                "sideAB = " + sideAB +
                ", sideAC = " + sideAC +
                ", sideBC = " + sideBC +
                '}';
    }
}

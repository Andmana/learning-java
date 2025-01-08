package Day03A;

public abstract class FlatShape {
    private int verticalLine;
    private int horizontalLine;
    private int diagonalLine;
    private int radius;
    private final float phi = 3.14f;

    public abstract float calculateArea();
    public abstract float calculateCircumference();

    public void printCalculation(){
        System.out.println("Area \t\t= " + calculateArea());
        System.out.println("Circumference  \t= " + calculateCircumference());
    }

    public int getVerticalLine() {
        return verticalLine;
    }
    public void setVerticalLine(int verticalLine) {
        this.verticalLine = verticalLine;
    }
    public int getHorizontalLine() {
        return horizontalLine;
    }
    public void setHorizontalLine(int horizontalLine) {
        this.horizontalLine = horizontalLine;
    }
    public int getDiagonalLine() {
        return diagonalLine;
    }
    public void setDiagonalLine(int diagonalLine) {
        this.diagonalLine = diagonalLine;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getPhi() {
        return phi;
    }
}

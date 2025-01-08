package Day03A;

public class Square extends FlatShape{
    public Square() {
        super();
    }

    public Square(int line) {
        this.setVerticalLine(line);
        this.setHorizontalLine(line);
    }

    public float calculateArea(){
        return getVerticalLine() * getVerticalLine();
    }

    public float calculateCircumference(){
        return 4 * getVerticalLine();
    }
}

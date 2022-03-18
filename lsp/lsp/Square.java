package lsp;

public class Square implements Quadrangleshape  {
    private int side;
    Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side=side;
    }
    public int getArea() {
        return side * side;
    }
}

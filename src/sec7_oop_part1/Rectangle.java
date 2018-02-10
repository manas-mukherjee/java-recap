package sec7_oop_part1;

public class Rectangle extends Shape{
    private int w;
    private int z;

    public Rectangle(int x, int y) {
        this(x, y,0,0);
    }

    public Rectangle(int x, int y, int w, int z) {
        super(x, y);
        this.w = w;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", z=" + z +
                '}';
    }
}

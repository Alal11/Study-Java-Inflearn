package mid.lang.object.test;

public class Rectangle {
    private int width;
    private int heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && heigth == rectangle.heigth;
    }
}

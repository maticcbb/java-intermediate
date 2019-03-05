package pl.sdacademy.room.lambda.zad;

// Class to lambda task number 2

public class Point {

    private Integer x;
    private Integer y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(Integer x, int y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }
}

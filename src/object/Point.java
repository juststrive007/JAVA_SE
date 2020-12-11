package object;

import java.util.Objects;

/**
 * 使用当前类测试object相关方法的重写
 *
 * java中所有的类都继承自Object，因此该类定义的
 * 方法所有类都就有.
 * 我们通常会重写从Obj继承下来的几个方法：
 * 例如：toString 和 equals方法
 * 这些方法在我们使用的API中经常会被它们调用，
 * 因此重写这些方法有助于我们更好的使用API
 * @author wm
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * 重写toString方法，
     * 原则:返回的字符串应当包含当前对象的相关信息
     * 具体格式没有要求，可以结合需求而定。
     * @return
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

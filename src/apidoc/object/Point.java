package apidoc.object;

import java.security.PublicKey;

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
}

import java.awt.*;

/**
 * Created by luni14 on 2016-09-30.
 */
public class triangle {
    private Color col;
    private double heightT;
    private double widthT;

    public triangle(double heightT, double widthT, Color col) {
        this.heightT = heightT;
        this.widthT = widthT;
        this.col = col;
    }

    public double getArea() {
        return heightT * widthT / 2;
    }

    public Color getCol() {
        return col;
    }

    public double getHeightT() {
        return heightT;
    }

    public double getWidthT() {
        return widthT;
    }
}

import java.awt.*;

/**
 * Created by luni14 on 2016-09-30.
 */
public class rectangle {
    private Color col;
    private double heightR;
    private double widthR;

    public rectangle(double heightR, double widthR, Color col) {
        this.heightR = heightR;
        this.widthR = widthR;
        this.col = col;
    }

    public double getArea() {
        return heightR * widthR;
    }

    public double getCircumference() {
        return heightR * 2 + widthR * 2;
    }

    public Color getCol() {
        return col;
    }

    public double getHeightR() {
        return heightR;
    }

    public double getWidthR() {
        return widthR;
    }
}

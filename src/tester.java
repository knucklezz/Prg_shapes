import java.awt.*;

/**
 * Created by luni14 on 2016-09-30.
 */
public class tester {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(2, 2, Color.cyan);
        triangle t1 = new triangle(3, 5, Color.BLUE);

        System.out.println("Rektangelns Area = " + r1.getArea() + " | " + " Rektangelns Omkrets " + r1.getCircumference() + " | " + " Färg = " + r1.getCol());
        System.out.println("Triangelns Area = " + t1.getArea() + " | "  + " Triangelns Färg = " + t1.getCol());
    }
}

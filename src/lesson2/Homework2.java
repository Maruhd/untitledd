package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        a = 2;
        b = -7;
        c = 3;
        d = b * b - 4 * a * c;
        if (d>0) {
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("root equation:" + x1 + ", " + x2);
        }
        else if (d==0) {
            x1 = (-b) / (2 * a);
            System.out.println("root equation = " + x1);
        }
        else
            System.out.println("no root");
    }
}

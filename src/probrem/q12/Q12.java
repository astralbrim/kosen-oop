package probrem.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Circle{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getOutline() {
        return 2 * radius * Math.PI;
    }
}
public class Q12 {
    public static void main(String[] args) {
        System.out.println("円の半径を入力してください");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = bufferedReader.readLine();
        }catch (IOException E){
            return;
        }

        double radius = Double.parseDouble(str);

        Circle circle = new Circle();

        circle.setRadius(radius);

        System.out.println("円の面積: " + circle.getArea());

        System.out.println("円の外周: " + circle.getOutline());
    }
}

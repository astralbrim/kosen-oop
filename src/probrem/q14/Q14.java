package probrem.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CircleB{
    private final double radius;

    public CircleB(){
        this.radius = 0.0;
    }
    public CircleB(double radius){
        if(radius < 0) {
            System.out.println("不適切な値が入力されました");
            this.radius = 0.0;
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getOutline() {
        return 2 * radius * Math.PI;
    }
}
public class Q14 {
    public static void main(String[] args) {
        System.out.println("円の半径を入力してください");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = bufferedReader.readLine();
        }catch (IOException E){
            return;
        }

        double radius1 = Double.parseDouble(str);

        CircleB circle1 = new CircleB(radius1);

        System.out.println("円1について");
        System.out.println("円の面積: " + circle1.getArea());
        System.out.println("円の外周: " + circle1.getOutline());

        CircleB circle2 = new CircleB();

        System.out.println();

        System.out.println("円2について");
        System.out.println("円の面積: " + circle2.getArea());
        System.out.println("円の外周: " + circle2.getOutline());

    }
}


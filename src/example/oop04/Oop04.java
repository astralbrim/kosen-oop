package example.oop04;

class CarEx20
{
    int num;
    double gas;

    void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }

    void showCar(){
        System.out.println("車の情報");
        this.show();
    }
}
public class Oop04 {
    public static void main(String[] args) {
        CarEx20 car1 = new CarEx20();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.show();
        System.out.println();
        car1.showCar();
    }
}

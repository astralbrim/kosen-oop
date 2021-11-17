package example.oop09;

class CarEx29
{
    private int num;
    private double gas;

    public CarEx29(){
        this.num = 1234;
        this.gas = 20.0;
        System.out.println("ナンバーが" + this.num + "ガソリン量が" + this.gas + "のCarオブジェクトを作成しました。");
    }

    public CarEx29(int num, double gas){
        this.gas = gas;
        this.num = num;
        System.out.println("ナンバーが" + this.num + "ガソリン量が" + this.gas + "のCarオブジェクトを作成しました。");
    }

    public void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }
}
public class Oop09 {
    public static void main(String[] args) {
        CarEx29 car1 = new CarEx29();
        car1.show();
        System.out.println();

        CarEx29 car2 = new CarEx29(5678, 10.0);

        car2.show();

    }
}

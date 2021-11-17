package example.oop10;

class CarEx26
{
    private int num;
    private int seat;
    private double gas;

    public CarEx26(int num, int seat, double gas){
        this.num = num;
        this.seat = seat;
        this.gas = gas;
        System.out.println("ナンバーが" + this.num + "座席数が" + this.seat + "ガソリン量が" + this.gas + "のCarオブジェクトを作成しました。");
    }

    public CarEx26(int num){
        this(num, 7, 20.0);
    }

    public CarEx26(double gas){
        this(1234, 7, gas);
    }


    public void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("座席数は" + this.seat + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }
}
public class Oop10 {
    public static void main(String[] args) {
        CarEx26 car1 = new CarEx26(5678);
        car1.show();
        System.out.println();

        CarEx26 car2 = new CarEx26(10.0);

        car2.show();
    }
}

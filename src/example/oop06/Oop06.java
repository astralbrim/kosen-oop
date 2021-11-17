package example.oop06;

class CarEx22{
    private int num;
    private double gas;

    void setNumGasGood(int num, double gas){
        this.gas = gas;
        this.num = num;
        System.out.println("ナンバーを" + this.num + "、ガソリン量を" + this.gas + "に設定");
    }

    void setNumGasBad(int num, double gas){
        gas = gas;
        num = num;
        System.out.println("ナンバーを" + this.num + "、ガソリン量を" + this.gas + "に設定");
    }

    void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }

    void showCar(){
        System.out.println("車の情報");
        this.show();
    }
}
public class Oop06 {
    public static void main(String[] args) {
        CarEx22 car1 = new CarEx22();

        car1.setNumGasBad(1234, 20.5);
        System.out.println("setNumGasBadの結果:");
        car1.showCar();

        System.out.println();

        car1.setNumGasGood(1234, 20.5);

        System.out.println("setNumGasGoodの結果:");

        car1.showCar();
    }
}

package example.oop05;

class CarEx21{
    private int num;
    private double gas;

    int getNum(){
        System.out.println("ナンバーを取得");
        return this.num;
    }

    double getGas(){
        System.out.println("ガソリン量を取得");
        return this.gas;
    }

    void setNumGas(int num, double gas){
        this.gas = gas;
        this.num = num;
        System.out.println("ナンバーを" + this.num + "、ガソリン量を" + this.gas + "に設定");
    }

    void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }
}
public class Oop05 {
    public static void main(String[] args) {
        CarEx21 car1 = new CarEx21();

        car1.setNumGas(1234, 20.5);

        int car1Num = car1.getNum();
        double car1Gas = car1.getGas();

        System.out.println();

        System.out.println("オブジェクトの値");
        car1.show();

        System.out.println();

        System.out.println("オブジェクトから取得した値");

        System.out.println("ナンバーは" + car1Num + "です。");
        System.out.println("ガソリン量は" + car1Gas + "です。");
    }
}

package example.oop11;

class CarEx27{
    public static int sum = 0;
    private int num;
    private double gas;

    public CarEx27(){
        num = 0;
        gas = 0.0;

        sum++;

        System.out.println("Carオブジェクトを作成しました。");
    }

    public void setCar(int num, double gas){
        this.num = num;
        this.gas = gas;

        System.out.println("ナンバーを" + this.num + "ガソリン量を" + this.gas + "にしました。");
    }

    public void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }

    public static void showSum(){
        System.out.println("Carオブジェクトの数は、" + sum + "です。");
    }
}

public class Oop11 {
    public static void main(String[] args) {
        CarEx27.showSum();

        System.out.println();

        CarEx27 car1 = new CarEx27();
        car1.setCar(1234, 20.5);

        System.out.println();
        CarEx27.showSum();

        System.out.println();

        CarEx27 car2 = new CarEx27();
        car2.setCar(5678, 10.5);

        System.out.println();
        CarEx27.showSum();

    }
}

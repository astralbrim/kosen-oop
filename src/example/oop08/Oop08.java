package example.oop08;


class CarEx24{
    private int num;
    private double gas;

    public void setCar(int num){
        this.num = num;
        System.out.println("ナンバーを" + this.num + "に設定");
    }

    public void setCar(double gas){
        this.gas = gas;
        System.out.println("ガソリン量を" + this.gas + "に設定");
    }

    public void setCar(int num, double gas){
        this.gas = gas;
        this.num = num;
        System.out.println("ナンバーを" + this.num + "、ガソリン量を" + this.gas + "に設定");
    }

    void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }
}
public class Oop08 {
    public static void main(String[] args) {
        CarEx24 car1 = new CarEx24();

        car1.setCar(1234, 20.5);
        car1.show();

        System.out.println();

        car1.setCar(5678);
        car1.show();

        System.out.println();

        car1.setCar(10.5);
        car1.show();
    }
}

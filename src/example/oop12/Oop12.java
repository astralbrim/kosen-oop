package example.oop12;


class CarEx28{
    private int num;
    private double gas;

    public CarEx28(){
        num = 0;
        gas = 0.0;

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
}


public class Oop12 {
    public static void main(String[] args) {
     CarEx28[] cars = new CarEx28[3];

     for (int i = 0; i < cars.length; i++){
         cars[i] = new CarEx28();
     }

     System.out.println();

     cars[0].setCar(1234, 20.5);
     cars[1].setCar(5678, 30.5);
     cars[2].setCar(9123, 40.5);

     System.out.println();

        for (CarEx28 car : cars) {
            car.show();
        }
    }
}

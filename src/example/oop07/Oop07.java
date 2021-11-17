package example.oop07;

class CarEx23{
    private int num;
    private double gas;

    public void setNumGas(int num, double gas){
        if(gas > 0 && gas < 1000)
        {
            this.gas = gas;
            this.num = num;
            System.out.println("ナンバーを" + this.num + "、ガソリン量を" + this.gas + "に設定");
        }else {
            System.out.println(gas + "は正しいガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }

    public void show(){
        System.out.println("ナンバーは" + this.num + "です。");
        System.out.println("ガソリン量は" + this.gas + "です。");
    }
}
public class Oop07 {
    public static void main(String[] args) {
        CarEx23 car1 = new CarEx23();
        car1.setNumGas(1234, -10.0);
        System.out.println();

        car1.setNumGas(1234, 10.0);
    }
}

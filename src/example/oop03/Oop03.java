package example.oop03;

class CarEx19
{
    int num;
    double gas;
}

public class Oop03 {
    public static void main(String[] args) {
     CarEx19 car1 = new CarEx19();
     CarEx19 car2 = new CarEx19();

     car1.num = 1234;
     car1.gas = 20.5;

     car2.num = 5678;
     car2.gas = 30.5;

     System.out.println("car1について");
     System.out.println("ナンバーは" + car1.num + "です。");
     System.out.println("ガソリン量は" + car1.gas + "です。");
     System.out.println();
     System.out.println("car2について");
     System.out.println("ナンバーは" + car2.num + "です。");
     System.out.println("ガソリン量は" + car2.gas + "です。");
    }
}

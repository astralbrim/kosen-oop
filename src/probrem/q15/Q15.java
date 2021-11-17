package probrem.q15;

import java.util.Objects;

class Dog2{
    public static int sum;
    private String name;
    private int age;

    public Dog2(String name, int age){
        this.name = name;
        this.age = age;
        sum++;
    }

    public Dog2(String name){
        this(name, -1);
    }

    public Dog2(int age){
        this("犬", age);
    }

    public Dog2(){
        this("野良", -1);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark(){
        if(Objects.equals(this.name, "犬") || Objects.equals(this.name, "野良")){
          print("ウゥ～");
        } else if(this.age < 0){
            print("年齢不明です。(age: -1)");
        }else if(this.age < 5){
            print("キャン!キャン!");
        }else if(this.age < 10){
            print("ワン!ワン!");
        }else if (this.age < 30){
            print("クン!クン!");
        }else {
            print("おぉん！おぉん！");
        }
    }

    private void print(String str){
        System.out.println(str);
    }

    public static void showSum(){
        System.out.println("Dog2オブジェクトの数は" + sum + "個です。");
    }

}

public class Q15 {
    public static void main(String[] args) {
        Dog2.showSum();
        System.out.println();

        Dog2 dog1 = new Dog2("マイキ", 19);
        System.out.println(dog1.getAge() + "歳の" + dog1.getName() + "が吠えた");
        dog1.bark();
        Dog2.showSum();

        System.out.println();

        Dog2 dog2 = new Dog2("マイキ");
        System.out.println(dog2.getAge() + "歳の" + dog2.getName() + "が吠えた");
        dog2.bark();


        System.out.println();

        Dog2.showSum();

        System.out.println();

        Dog2 dog3 = new Dog2(19);
        System.out.println(dog3.getAge() + "歳の" + dog3.getName() + "が吠えた");
        dog3.bark();
        System.out.println();

        Dog2.showSum();
        System.out.println();

        Dog2 dog4 = new Dog2();
        dog4.bark();
        System.out.println(dog4.getAge() + "歳の" + dog4.getName() + "が吠えた");
        System.out.println();

        Dog2.showSum();
    }
}

package probrem.q13;

class Dog{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(){
        if(this.age < 0){
            print("犬ではありません。");
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

}
public class Q13 {
    public static void main(String[] args) {
        Dog maiki = new Dog();
        Dog milk = new Dog();

        maiki.setName("マイキ");
        maiki.setAge(100);
        System.out.println(maiki.getAge() + "歳の" + maiki.getName() + "が吠えた");
        maiki.bark();

        milk.setName("ミルク");
        milk.setAge(50);
        System.out.println(milk.getAge() + "歳の" + milk.getName() + "が吠えた");
        milk.bark();
    }
}

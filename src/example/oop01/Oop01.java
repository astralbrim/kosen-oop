package example.oop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oop01 {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください。");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        String str;
        int num1;
        double num2;
        try {
           str = bufferedReader.readLine();
        }catch (IOException E){
            return;
        }

        System.out.println(str + "が入力されました。");

        System.out.println("整数と実数を入力してください");

        try {
            num1 = Integer.parseInt(bufferedReader.readLine());
            num2 = Double.parseDouble(bufferedReader.readLine());
        }catch (IOException E) {
            return;
        }

        System.out.println(num1 + "と" + num2 + "が入力されました");

    }
}

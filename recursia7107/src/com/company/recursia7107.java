package com.company;
import java.util.Scanner;
public class recursia7107 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число которое нужно возвести в степень");
        int a = sc.nextInt();
        System.out.println("Введите степень в которую нужно возвести число");
        int b = sc.nextInt();
        System.out.println("Ответ = " + stepen(a, b));
    }
    public static int stepen(int a, int b) { //Возведение в степень числа
        if (b == 0) return 1;
        if (b == 1) return a;
        if (b == 2) return a * a;
        if (b % 2 == 0) return stepen(stepen(a, b / 2), 2);
        return a * (stepen(a, b - 1));
    }

}

package homeWork1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        num1=scanner.nextInt();

        System.out.println("Введите второе число:");
        num2=scanner.nextInt();

        System.out.println("Введите третье число:");
        num3=scanner.nextInt();

        if (num1<num2&&num1<num3){  //min без учета равенства чисел
            min=num1;
        } else if (num2<num3){
            min=num2;
        } else min=num3;

        if (num1>num2&&num1>num3){   //max без учета равенства чисел
            max=num1;
        } else if (num2>num3){
            max=num2;
        } else max=num3;




        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);

    }
}

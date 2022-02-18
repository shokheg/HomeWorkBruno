package homeWork1;

import java.util.Scanner;

public class MinMaxFullCompare {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        a = scanner.nextInt();

        System.out.println("Введите второе число:");
        b = scanner.nextInt();

        System.out.println("Введите третье число:");
        c = scanner.nextInt();


        // далее алгоритмы max с учетом равенства чисел
        if (a == b && a == c) {
            max = a;
            min = a;
        } else if (a == b) {
            if (a > c) {
                max = a;
                min = c;
            } else max = c;
            min = a;
        } else if (a == c) {
            if (a > b) {
                max = a;
                min = b;
            } else max = b;
            min = a;
        } else if (c == b) {
            if (a > b) {
                max = a;
                min = b;
            } else max = b;
            min = a;
        } else   //далее идет алгоритм max когда все числа не равны
            if (a > b && a > c) {
                max = a;
                if (b < c) {
                    min = b;
                } else {
                    min = c;
                }
            } else if (b > c) {
                max = b;
                if (a < c) {
                    min = a;
                } else {
                    min = c;
                }
            } else if (a < b) {
                min = a;
                max = c;
            } else max = c;
        min = b;

        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
    }
}


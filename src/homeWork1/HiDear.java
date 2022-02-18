package homeWork1;

import java.util.Scanner;

public class HiDear {
    public static void main(String[] args) {
        String name;
        String sex;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя");
        name = scanner.nextLine();
        System.out.println("Введите ваш пол: 1-мужской,0-женский");
        sex = scanner.nextLine();
        if (sex.equals("0")){
            System.out.println("Привет, дорогая " + name);
        } else {
            System.out.println("Привет, дорогой " + name);
        }
    }
}

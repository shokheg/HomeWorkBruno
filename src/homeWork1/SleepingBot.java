package homeWork1;

import java.util.Scanner;

public class SleepingBot {
    public static void main(String[] args) {
       while (true) {
           Scanner scanner = new Scanner(System.in);
           if (!scanner.nextLine().isEmpty()) {             //если что-то вводим, бот отвечает
               System.out.println("Я сплю");
           } else break;                                    //если ничего не вводим, то выходим
       }
    }
}

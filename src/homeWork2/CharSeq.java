package homeWork2;
//Hard: Проверить, что в строке только латинские буквы нижнего регистра.
import java.util.Scanner;

public class CharSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test =scanner.nextLine();
        if (test.matches("[a-z]++")){
            System.out.println("В строке только строчные латинские символы");
        } else System.out.println("В строке есть другие символы");

    }

}

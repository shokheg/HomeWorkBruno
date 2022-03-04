package homeWork7;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Task3_Hard {

    public static void main(String[] args) {

        System.out.println(calcPolish("1 2 3 * - ")); //-5
        System.out.println(calcPolish("10 15 - 3 *")); //-15

    }

    public static long calcPolish(String s) {

        long number1;
        long number2;

        Stack<Long> stack = new Stack<Long>();

        Scanner str = new Scanner(s);
        String s1;


        while (str.hasNext()) {
            s1 = str.next();

            if (s1.equals("+") || s1.equals("-") || s1.equals("*") || s1.equals("/")) {

                switch (s1) {

                    case "+":
                        number1 = stack.pop();
                        number2 = stack.pop();
                        stack.push(number1 + number2);
                        break;
                    case "-":
                        number1 = stack.pop();
                        number2 = stack.pop();
                        stack.push(number2 - number1); //ПОРЯДОК ВАЖЕН!!!
                        break;
                    case "/":
                        number1 = stack.pop();
                        number2 = stack.pop();
                        stack.push(number1/number2);
                        break;
                    case "*":
                        number1 = stack.pop();
                        number2 = stack.pop();
                        stack.push(number1*number2);
                        break;
                }
            } else {
                stack.push(Long.parseLong(s1));
            }

        } return stack.pop();


    }

}








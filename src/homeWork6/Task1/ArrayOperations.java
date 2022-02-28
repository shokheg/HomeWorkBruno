package homeWork6.Task1;

import java.util.Arrays;

public final class ArrayOperations {

    public static void main(String[] args) {

        int[] array = {1,5,9,9,9,152,-587};
        System.out.println("максимум массива: " + max(array));
        System.out.println("минимум массива: " + min(array));
        System.out.println("индекс числа: " + "[" + indexOf(array, -587) + "]");
        System.out.println("сумма элементов массива: " + sum(array));
        replace(array, 9,0);
        System.out.println("сумма элементов массива: " + sum(array));
        System.out.println(Arrays.toString(array));

    }

    static int max(int[] array){

        int arrayMax = 0;

        for (int i : array) {

            arrayMax = Math.max(arrayMax, i);
        }
        return arrayMax;
    }

    static int min(int[] array){

        int arrayMin = 0;

        for (int i : array) {

            arrayMin = Math.min(arrayMin, i);

        }
        return arrayMin;
    }

    static int indexOf(int[] array, int value){

        int arrayIndexOf = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                arrayIndexOf = i;
                break;
            } else arrayIndexOf = -1;
        }
        return arrayIndexOf;
    }

    static int sum(int[] array){

        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }

    static void replace(int[] array, int oldInt, int newInt){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldInt) array[i] = newInt;
        }

    }



}

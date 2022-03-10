package homeWork7;

//Написать функцию, которая проверяет отсортирован ли массив по убыванию.
//Оценить сложность данного алгоритма

public class Task1 {

    public static void main(String[] args) {

        int[] testArray = {15,9,8,7,6,5,4,3,2};

        isArraySort(testArray);
    }

    static void isArraySort(int[] arr){   //сложность алгоритма O(n)

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1]) System.out.println("Массив не отсортирован по убыванию");
        }

    }
}

package homeWork3;

public class Main {
    public static void main(String[] args) {
//        Arithmetic ar = new Arithmetic();     Первая задача
//        ar.setX(5);

//        Employee emp1 = new Employee("Vasya", "Production manager", "emp1@narod.ru", "89112223344", 12000, 30  );
//        Employee emp2 = new Employee("German", "Transport manager", "emp2@narod.ru", "89113334455", 17000, 50  );
//        Employee emp3 = new Employee("Dmitriy", "SEO", "emp3@narod.ru", "89117778855", 215000, 60  );
//
//        Employee[] empArray = new Employee[3];
//
//        empArray[0] = emp1;
//        empArray[1] = emp2;
//        empArray[2] = emp3;
//
//        for (int i = 0; i < empArray.length; i++) {
//
//            if (empArray[i].age > 40) empArray[i].info();
//
//        }
        int[][] income = {
                {95, 67, 13, 55, 44, 11, 10}, // Доходы от первого заказчика
                {7, 190, 4, 44, 11, 1, 99},    // Доходы от второго заказчика
                {0, 5, -1, 500, 14, 90, 1},   // Доходы от третьего заказчика
        };

        freelanceCash(income);


    }

    static void freelanceCash(int[][] income){

            int max = 0;
            int rowNum = 0;
        for (int i = 0; i < income.length; i++) {
            int sum = 0;
            for (int j = 0; j < income[i].length ; j++) {
                sum = sum+income[i][j];
            }

            if (sum > max) {
                max = sum;
                rowNum = i;
            }
        }
        System.out.println("Больше всего заплатил заказчик из строки " + (rowNum+1) + " : " + max +" тугриков"); //поправил нумерацию строк в income для людей
    }

}

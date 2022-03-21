package homeWork10;

/*
Создать класс Customer
с 3 полями:
    целое число id
    строка name
    целое число age
конструктор, задающий все три поля
два метода:
    String customerType(),
        который вернет "deny" для возраста <14,
        "teen" для 14<=age<21
        "regular" для 21<=age<65
        "retiree" для age>=65
    переопределить toString(), для вывода в формате "name[customerType()]{id}"
 */

public class HW1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(334, "Федор Иванов", 47);
        Customer customer2 = new Customer(336, "Сигизмунд Игдрасилевич", 68);
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}


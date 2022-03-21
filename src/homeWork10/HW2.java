package homeWork10;

/*
Создать класс Account
с 3 полями:
    целое число id
    объект класса Customer с именем customer
    дробное число balance
два конструктора:
    один принимает целое число для id и ссылку на объект Customer (balance при этом будет 0.0)
    другой принимает целое число для id, ссылку на объект Customer и дробное число для balance
четыре метода:
    double put(double sum), который увеличивает balance на sum и возвращает balance
    double withdraw(double sum), который при возможноcти (balance - sum >= 0) уменьшает balance на sum и возвращает balance
    double deposit(int yearsNum, double percent), который расчитывает сколько будет денег через yearsNum лет
     под определенным количеством процентов
    переопределить toString(), для вывода в формате "name[customerType()]{id}: balance"
 */

public class HW2 {
    public static void main(String[] args) {
        Account account = new Account(1232, new Customer(32, "Vasya", 18), 50000);
        System.out.println(account.put(50000));
        System.out.println(account.withdraw(0));
        System.out.println(account.withdraw(1000000));
        System.out.println(account.deposit(2,11));
        System.out.println(account.toString());


    }
}


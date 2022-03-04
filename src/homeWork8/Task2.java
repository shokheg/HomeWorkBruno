package homeWork8;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", 23));
        customerMap.put("2", new Customer("Олег", 17));
        customerMap.put("3", new Customer("Максим", 48));
        customerMap.put("4", new Customer("Евгения", 67));

        System.out.println(customerAgeFilter(customerMap,17, 48));
    }

    static HashMap<String, Customer> customerAgeFilter (HashMap<String, Customer> customerHashMapInput, int ageFrom, int ageTo){
        HashMap<String,Customer> customerHashMapOutput = new HashMap<>();

        for (Map.Entry<String,Customer> entry : customerHashMapInput.entrySet() ) {
            if (entry.getValue().getAge()>=ageFrom && entry.getValue().getAge()<ageTo){
                customerHashMapOutput.put(entry.getKey(), entry.getValue());
            }
        }

        return customerHashMapOutput;
    }
}

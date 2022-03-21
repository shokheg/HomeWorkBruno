package homeWork10;

public class Customer {
    private int id;
    private String name;
    private int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String customerType() {
        if (age < 14) {
            return "deny";
        } else if (age >= 14 && age < 21) {
            return "teen";
        } else if (age >= 21 && age < 65) {
            return "regular";
        } else return "retiree";
    }

    @Override
    public String toString() {
        return name + "[" + customerType() + "]" + "{" + id + "}";
    }
}

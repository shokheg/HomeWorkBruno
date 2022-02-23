package homeWork5.Task3;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Magazine magazine = new Magazine();
        Book book = new Book();

        printer.print(book);
        printer.print(magazine);

    }
}

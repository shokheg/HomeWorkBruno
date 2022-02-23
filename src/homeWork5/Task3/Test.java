package homeWork5.Task3;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printable printableMagazine = new Magazine();
        Printable printableBook = new Book();

        printer.print(printableBook);
        printer.print(printableMagazine);

    }
}

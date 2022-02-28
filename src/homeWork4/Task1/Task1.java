package homeWork4.Task1;

public class Task1 {
    public static void main(String[] args) {

        Book book1 = new Book("AAAA");

        Book book2 = new Book("BBBB");

        Book book3 = new Book("CCCC");


        Storage storage1 = new Storage(21);
        storage1.addBookToStorage(book1);
        storage1.addBookToStorage(book2);
        storage1.addBookToStorage(book3);

        for (int i = 0; i < storage1.getBookStorage().length; i++) {
            if (storage1.getBookStorage()[i]!=null)
                System.out.println("Содержимое ячейки № " + i + " " + storage1.getBookStorage()[i].toString());
        }


    }
}

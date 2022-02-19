package homeWork4.Task1;

public class Task1 {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();
        Book book9 = new Book();
        Book book10 = new Book();
        Book book11 = new Book();
        Book book12 = new Book();
        Book book13 = new Book();
        Book book14 = new Book();
        Book book15 = new Book();
        Book book16 = new Book();
        Book book17 = new Book();
        Book book18 = new Book();
        Book book19 = new Book();
        Book book20 = new Book();
        Book book21 = new Book();
        Book book22 = new Book();
        Book[] books = new Book[20];
        Storage storage1 = new Storage(books, 21);
        storage1.addBookToStorage(book1,storage1.getBookStorage());

        for (int i = 0; i < storage1.getBookStorage().length; i++) {
            System.out.println(storage1.getBookStorage()[i].toString());
        }


    }
}

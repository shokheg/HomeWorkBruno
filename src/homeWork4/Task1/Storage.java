package homeWork4.Task1;

public class Storage {

    private Book[] bookStorage;
    private int storageNumber;



    public Storage(Book[] bookStorage, int storageNumber) {
        setStorageNumber(storageNumber);
        setBookStorage(bookStorage);
    }
    public Book[] getBookStorage() {
        return bookStorage;
    }

    public void setBookStorage(Book[] bookStorage) {
        if (bookStorage.length != 20) throw new IllegalArgumentException("Размер хранилища должен быть 20");
        this.bookStorage = bookStorage;
    }

    public void setStorageNumber(int storageNumber) {
        this.storageNumber = storageNumber;
    }

    public void addBookToStorage(Book book, Book[] bookStorage ){
        for (int i = 0; i < 20; i++) {
            if (bookStorage[i] == null){
                bookStorage[i] = book;
            } else System.out.println("Хранилище переполнено");
        }

    }
}

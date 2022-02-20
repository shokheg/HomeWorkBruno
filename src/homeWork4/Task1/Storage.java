package homeWork4.Task1;

public class Storage {

    private Book[] bookStorage;
    private int storageNumber;



    public Storage(int storageNumber) {
        setStorageNumber(storageNumber);
        Book[] bookStorage = new Book[20];
        for (int i = 0; i < bookStorage.length; i++) {
            bookStorage[i] = new Book();
        }
        this.bookStorage = bookStorage;
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

    public void addBookToStorage(Book book){

        boolean isEmpty = false;
        int indexOfFirstEmptySlot = 0;

        for (int i = 0; i < 20; i++) {
            if (bookStorage[i].getBookTitle() == null){
                isEmpty = true;
                indexOfFirstEmptySlot = i;
               break;
            }
        }

        if (isEmpty) {
            bookStorage[indexOfFirstEmptySlot] = book;
            System.out.println("Книга уложена в слот № " + indexOfFirstEmptySlot);
        }

    }
}

package homeWork4.Task1;

import java.time.Year;
import java.util.Arrays;

public class Book {

    private String bookTitle;
    private int pages;
    private int year;
    private Author[] authors;



    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().length() < 2)
            throw new IllegalArgumentException("Название книги слишком короткое") ;
        this.bookTitle = bookTitle;
    }

//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public int getYear() {
//        return year;
//    }

    public void setYear(int year) {
        if (this.year>Year.now().getValue()) throw new IllegalArgumentException("Значение года должно быть меньше");
        this.year = year;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}

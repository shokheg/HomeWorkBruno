package homeWork4.Task1;

public class Author {

    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        setAuthorName(authorName);
        setAuthorName(authorSurname);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if (authorName == null || authorName.trim().length() < 2) {
            throw new IllegalArgumentException("Слишком короткое имя") ;
        }

        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        if (authorName == null || authorName.trim().length() < 2) {
            throw new IllegalArgumentException("Слишком короткая фамилия") ;
        }
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }
}

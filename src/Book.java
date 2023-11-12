import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private int year;

    public Book(Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Автор " + this.author + ", Название книги " + this.title + ", год выпуска" + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year);
    }
}

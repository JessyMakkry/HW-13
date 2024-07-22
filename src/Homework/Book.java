package Homework;

public class Book {
    private String name;//
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return this.name;
    }

    public Author getBookAuthor() {
        return this.author;
    }

    public String getBookAuthorName() {
        return this.author.getAuthorName();
    }

    public String getBookAuthorSurname() {
        return this.author.getAuthorSurname();
    }

    public int getBookYear() {
        return this.year;
    }

    public void setBookYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга " + name + ", Автор " + author + ", год издания " + year;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        if (this.name.equals(b2.name) && this.author.equals(b2.author) && this.year == b2.year) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}

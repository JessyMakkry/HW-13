package Homework;

public class Author {
    private String name;//
    private String surname;
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getAuthorName() {
        return this.name;
    }
    public String getAuthorSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        if (this.name.equals(a2.name)&&this.surname.equals(a2.surname)) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname);
    }
}


package Homework;

public class Main {
    public static void printseparator(){
        System.out.println("_____________________________________");
    }
    public static void main(String[] args) {
        System.out.println("Task 1");
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");
        Book theRedOne = new Book("Капитанская дочка", Pushkin, 1836);
        Book theGreenOne = new Book("Война и мир", Tolstoy,1863);
        System.out.println("Pushkin = " + Pushkin);
        System.out.println("Tolstoy = " + Tolstoy);
        printseparator();
        System.out.println("theRedOne = " + theRedOne);
        System.out.println("theGreenOne = " + theGreenOne);
        printseparator();
        Author Pushkin2 = new Author("Александр", "Пушкин");
        System.out.println("Pushkin.equals(Pushkin2) = " + Pushkin.equals(Pushkin2));
        System.out.println("Pushkin.equals(Tolstoy) = " + Pushkin.equals(Tolstoy));
        printseparator();
        Book theBlueOne = new Book ("Капитанская дочка", Pushkin, 1836);
        System.out.println("theRedOne.equals(theBlueOne) = " + theRedOne.equals(theBlueOne));
        System.out.println("theRedOne.equals(theGreenOne) = " + theRedOne.equals(theGreenOne));
        printseparator();
        System.out.println("Pushkin.hashCode() = " + Pushkin.hashCode());
        System.out.println("Pushkin2.hashCode() = " + Pushkin2.hashCode());
        System.out.println("Tolstoy.hashCode() = " + Tolstoy.hashCode());
        System.out.println("theBlueOne.hashCode() = " + theBlueOne.hashCode());
        System.out.println("theGreenOne.hashCode() = " + theGreenOne.hashCode());
        System.out.println("theRedOne.hashCode() = " + theRedOne.hashCode());
        printseparator();
    }
}
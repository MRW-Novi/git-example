package nl.novi.javaprogrammeren;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Wereld!");

        Person p = new Person("Sjaak");

        Person p3 = new Person("Henkie");

        System.out.println(p.getName());
    }
}

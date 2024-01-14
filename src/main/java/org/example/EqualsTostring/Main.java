package org.example.EqualsTostring;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Beliz", "Karagullu", 23);
        System.out.println(person); //toString metotu cagrılır

        Person person2 = new Person("Beliz", "Karagullu", 23);

        boolean isSame = person.equals(person2);
        System.out.println(isSame);

        OverridedPerson overridedPerson = new OverridedPerson("Beliz", "Karagullu", 23);
        System.out.println(overridedPerson); //override edilmis metod

        OverridedPerson overridedPerson2 = new OverridedPerson("Beliz", "Karagullu", 23);

        isSame = overridedPerson.equals(overridedPerson2);
        System.out.println(isSame);

        System.out.println("First person hash code is " + overridedPerson.hashCode());
        System.out.println("Second person hash code is " + overridedPerson2.hashCode());








    }
}
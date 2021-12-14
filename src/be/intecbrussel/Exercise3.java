package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise3 {
    public static void main(String[] args) {
        Person[] personArray = new Person[]{new Person("jullie"),
                new Person("tom"),
                new Person("alex"),
                new Person("johan"),
                new Person(Person.Gender.MALE)};
        Person[] newArray= Stream.of(personArray).toArray(Person[]::new);
        System.out.println(Arrays.toString(newArray));
    }

}

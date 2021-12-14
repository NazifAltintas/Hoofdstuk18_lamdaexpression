package be.intecbrussel;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        Person[] personArray = new Person[]{new Person("jullie"),
                new Person("tom"),
                new Person("alex"),
                new Person("alex"),
                new Person("alex"),
                new Person("alex"),
                new Person("alex"),
                new Person("johan"),
//             new Person(Person.Gender.MALE)};
        };
        Stream.of(personArray).
                distinct().
                filter(person -> person.getName().startsWith("al")).
                forEach(System.out::println);

    }
}

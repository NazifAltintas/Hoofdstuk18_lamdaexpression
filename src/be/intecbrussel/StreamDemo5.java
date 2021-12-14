package be.intecbrussel;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

        Person[] personArray = new Person[]{new Person("jullie",10),
                new Person("tom",10),
                new Person("alex",20),
                new Person("alex",20),
                new Person("alex",100),
                new Person("alex",100),
                new Person("alex",50),
                new Person("johan",50)};
        Stream.of(personArray).distinct().forEach(System.out::println);
        OptionalDouble avaerage= Stream.of(personArray).distinct().mapToInt(person-> person.getAge()).average();
        System.out.println(avaerage.isPresent()?avaerage.getAsDouble():"0");

        Stream.of(personArray).distinct(). map(person -> person.getName().toUpperCase()).forEach(System.out::println);
    }
}

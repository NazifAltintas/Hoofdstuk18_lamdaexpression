package be.intecbrussel;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {


        String[] strArray = {"this", "is", "a", "string", "array"};
        Stream.of(strArray).   //forEach(System.out::println);    of  forEach(new ConsumerImpl()) ;  of  forEach((s)->System.out.println(s))
                //forEach(Stringbuilder::new);          of   forEach(String::toUperCase);
                        forEach(new Consumer<String>() {
                                    @Override
                                    public void accept(String s) {
                                        System.out.println(s);

                                    }
                                }
                );
        IntStream.range(0, 100).forEach(System.out::println);

        Person[] personArray = new Person[]{new Person("jullie"),
                new Person("tom"),
                new Person("alex"),
                new Person("johan"),
                new Person(Person.Gender.MALE)};

        Stream.of(personArray).
                forEach(System.out::println);
        System.out.println("-----------------------------------");

        String seperated = Stream.of(strArray).reduce("", (t, u) -> t + ";" + u);
        seperated = seperated.substring(1);
        System.out.println(seperated);
        String seperated1 = Stream.of(strArray).reduce("", (t, u) -> t + u+ ";" );
        seperated1 = seperated1.substring(0,seperated1.length()-1);
        System.out.println(seperated1);


    }


}

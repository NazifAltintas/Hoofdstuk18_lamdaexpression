package be.intecbrussel;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 5, 8, 4, 6, 88, 4, 5, 44,};
        IntStream.of(intArray).
                forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        long count = IntStream.of(intArray).count();
        System.out.println("count is a: " + count);

        System.out.println("-----------------------------------------------------");

        OptionalInt maximum = IntStream.of(intArray).max();
        if (maximum.isPresent()) {
            System.out.println("maximum: "+maximum.getAsInt());
        } else {
            System.out.println("no result");
        }
        System.out.println("-----------------------------------------------------");
        System.out.println(IntStream.of(intArray).reduce(0, (t, u) -> t + u * u));
        System.out.println("-----------------------------------------------------");


    }
}

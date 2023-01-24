package example.example6;

import java.util.Arrays;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Double[] numbers2 = {1.0, 2.0, 3.0};
        System.out.println(countGreaterThan(numbers, 0));
        System.out.println(countGreaterThan(numbers2, 0.0));
    }

//    interface A {
//    }
//
//    interface B {
//    }

    // several bounds & & & &
    //    <T extends Comparable<T> & A & B>
    private static <T extends Comparable<T>> long countGreaterThan(T[] numbers, T value) {
        return Arrays.stream(numbers)
                .filter(number -> number.compareTo(value) > 0)
                .count();
    }

}

package example.example7;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Number> list2 = Arrays.asList(1, 2, 3, 4);
        List<Double> list3 = Arrays.asList(1.5, 2.6, 3.4, 4.1);
        print(list1);
        print2(list1);
        print(list2);
        print2(list2);
        print(list3);
        print2(list3);
    }

    // upper bounded wildcard
    private static void print(List<? extends Number> list) {
        list.forEach(e -> System.out.println(e.getClass().getName() + " " + e));
    }

    //bounded type parameter
    private static <T extends Number> void print2(List<T> list) {
        list.forEach(e -> System.out.println(e.getClass().getName() + " " + e));
    }

    /*
        Difference between a wildcard bound and a type parameter bound:
        1) A wildcard can have only one bound, while a type parameter can have several bounds.
        2) A wildcard can have a lower or an upper bound, while there is no such thing as a lower bound for a type parameter.
        3) Bounded type parameter, we have the option to use it elsewhere in our generic method.
     */

}

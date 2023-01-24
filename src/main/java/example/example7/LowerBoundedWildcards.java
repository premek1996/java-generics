package example.example7;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {

    public static void main(String[] args) {
        List<Number> list1 = Arrays.asList(1.0, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<Double> list3 = Arrays.asList(1.5, 2.6, 3.4, 4.1);
        print(list1);
        print(list2);
        //print(list3);
    }

    private static void print(List<? super Integer> list) {
        list.forEach(e -> System.out.println(e.getClass().getName() + " " + e));
    }

}

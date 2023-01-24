package example.example7;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {

    public static void main(String[] args) {

        // ? Wildcards
        List<Object> list1 = Arrays.asList(1, 2, 3, 4, "Sfafs");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<String> list3 = Arrays.asList("sffafas", "fsa", "fsadaf");
        print(list1);
        print(list2);
        print(list3);
    }

    // Unbounded Wildcards
    private static void print(List<?> list) {
        list.forEach(e -> System.out.println(e.getClass().getName() + " " + e));
    }

}

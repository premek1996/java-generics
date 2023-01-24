package example.example3;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType {

    public static void main(String[] args) {
        /*
        List<E> E -> element
         */
        List<String> names = new ArrayList<>();
        names.add("1");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        /*
        Map<K,V> K -> key, V -> value
         */
        Map<String, String> map = new HashMap<>();
        Map<Point, Double> map2 = new HashMap<>();
    }

}


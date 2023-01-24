package example.example5;

public class GenericsAndMethods {

    public static void main(String[] args) {
        String[] names = {"ALi", "Jamilia"};
        print(names);
        Character[] letters = {'A', 'B'};
        print(letters);
    }

    private static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }

}

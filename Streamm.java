
import java.util.*;


public class Streamm {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        System.out.println("Even Numbers:");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        List<String> names = Arrays.asList("Rahul", "Amit", "Sneha", "Priya");

        System.out.println("\nNames in Uppercase:");
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        List<String> words = Arrays.asList(
                "Apple", "Banana", "Avocado", "Mango", "Apricot"
        );

        long count = words.stream().filter(word -> word.startsWith("A")).count();

        System.out.println("\nStrings starting with A: " + count);
        System.out.println("\nSorted Names:");
        names.stream().sorted().forEach(System.out::println);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("Antelope", "action", "cut", "act", "ace", "Dog");
        List<String> filteredList = search(firstList);
        System.out.println("First list: " + firstList);
        System.out.println("Filtered list: " + filteredList);
    }

    public static List<String> search(List<String> list) {
        return list.stream()
                .filter(str -> str.startsWith("a"))
                .filter(str -> str.length() == 3)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
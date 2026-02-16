import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Jane");

        List<String> modifiedAndSortedNames = modifyAndSortNames(names);
        System.out.println(modifiedAndSortedNames);
    }

    private static List<String> modifyAndSortNames(List<String> names) {
        return names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .toList();
    }
}

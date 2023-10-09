package Task3.ii;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> str = List.of("a1", "a4", "a3", "a2", "a1", "a4");
        System.out.println(str);
        System.out.println("------------------");
        List<String> modifiedStr = str.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(modifiedStr);
        List<String> addStr = str.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList());
        System.out.println(addStr);
        int[] intArray = str.stream()
                .mapToInt(s -> Integer.parseInt(s.substring(1)))
                .toArray();
        for(int i : intArray){
            System.out.print("[" + intArray[i] + "] ");
        }
        System.out.println();
        List<String> uniqueString = str.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueString);
    }
}


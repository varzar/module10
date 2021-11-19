package Task1;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public String evenNames(List<String> input){
        return input.stream()
                .filter((word) -> input.indexOf(word) % 2 == 0)
                .map(word -> input.indexOf(word) + 1 + ". " + word)
                .collect(Collectors.joining(", ", "", "."));
    }
}

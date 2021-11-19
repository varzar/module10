package Task3;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

public class Task3 {
    public String getIntFromStringArray(String[] input){
        return  Arrays.stream(input)
                .flatMapToInt(String::chars)
                .mapToObj(ch -> (char)ch)
                .filter(ch -> ch > 47 && ch < 58)// ASCII: 48...57
                .sorted(Comparator.comparingInt(Character::valueOf))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));


    }
}

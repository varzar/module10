import Task1.Task1;
import Task2.Task2;
import Task3.Task3;
import Task4.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static Task5.Task5.zip;
import static java.util.stream.Collectors.toList;

public class TaskTest {
    public static void main(String[] args) {
        List<String> inputNames = Arrays.asList("Ivan", "Peter", "Eugen", "Oleh", "Ostap", "Maksim", "Michael");
        String[] inputStringToDigit = {"1,2,0","4,5"};
        Task1 task1 = new Task1();
        System.out.println(task1.evenNames(inputNames));

        Task2 task2 = new Task2();
        System.out.println(task2.sortReversUpperCase(inputNames));

        Task3 task3 = new Task3();
        System.out.println(task3.getIntFromStringArray(inputStringToDigit));

        long seed = 1L;
        long a = 25214903917L;
        int c = 11;
        long m = (long) Math.pow(2,48);
        Task4 task4= new Task4();
        List<Long> listResult = task4.randomGeneratorToStream(a, c, m, seed)
                .limit(15)
                .collect(toList());
        System.out.println(listResult);

        System.out.println(
                zip(Stream.of(1, 2, 3, 4), Stream.of(4, 5, 6))
                        .collect(Collectors.toList()));

    }
}

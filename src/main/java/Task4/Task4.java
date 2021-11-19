package Task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Task4 {
    public Stream<Long> randomGeneratorToStream(long a, long c, long m, long seed){
        return LongStream.iterate(seed,  x -> (x * a + c) % m)
                .mapToObj(Long::valueOf);
    }
}

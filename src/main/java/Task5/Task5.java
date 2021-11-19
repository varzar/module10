package Task5;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

        List<T> fList = first.toList();
        List<T> sList = second.toList();

        int length = Math.min(fList.size(), sList.size());

        class Wrapper implements Comparable<Wrapper>{
            int position;
            T value;

            public Wrapper(int position, T value) {
                this.position = position;
                this.value = value;
            }

            public T getValue() {
                return value;
            }

            @Override
            public int compareTo(Wrapper o) {
                return Integer.compare(position, o.position);
            }
        }


        Function<List<T>, Stream<Wrapper>> wrap = seq -> IntStream.range(0, length)
                .mapToObj(i ->  new Wrapper(i, seq.get(i)));

        return Stream.concat(wrap.apply(fList),
                        wrap.apply(sList))
                .sorted()
                .map(Wrapper::getValue);
    }
}

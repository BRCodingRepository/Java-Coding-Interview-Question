package java8Example;

//38.find all unique substrings of a given length in a string using streams.

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Example38 {
    static void main() {
        String s="bheemaraya";
        int n=3;
        List<String> collect = IntStream.rangeClosed(0, s.length() - n)
                .mapToObj(i -> s.substring(i, i + n))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }
}
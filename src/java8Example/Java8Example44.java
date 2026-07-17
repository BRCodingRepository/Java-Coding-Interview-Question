package java8Example;

//44.generate a list of first 10 prime numbers using streams.

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Example44 {
    static void main() {
        List<Integer> collect = Stream.iterate(2, i -> i + 1)
                .filter(Java8Example44::isPrime)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);


    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        return IntStream.rangeClosed(2,(int) Math.sqrt(n)).noneMatch(i->n%i==0);
    }
}
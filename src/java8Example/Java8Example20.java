package java8Example;

//20.generate a list of the first 20 Fibonacci numbers using streams.

import java.util.stream.Stream;

public  class Java8Example20 {
    static void main() {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .limit(20).map(f->f[0]).forEach(System.out::println);
    }
}
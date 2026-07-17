package java8Example;

//33.Given String str="telCo" Toggle it to str=TELcO using streams.

import java.util.stream.Collectors;

public class Java8Example33 {
    static void main() {
        String string="telCo";
        String string1 = string.chars().mapToObj(c -> (char) c)
                .map(c1 ->
                        Character.isUpperCase(c1) ?
                                Character.toLowerCase(c1)
                                : Character.toUpperCase(c1))
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println("string1 = " + string1);

    }
}
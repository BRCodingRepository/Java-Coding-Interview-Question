package java8Example;

//27.calculate the product of all elements in a list of integers using streams.

import java.util.List;

public class Java8Example27 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
long product=integerList.stream().reduce(1,(a,b)->a*b);
        System.out.println(product);
    }
}
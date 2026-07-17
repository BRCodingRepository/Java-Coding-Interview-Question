package java8Example;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//2.Convert a list of integers into a map where the key is the integer and the value is its square.
public class Java8Example2 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
       Map<Integer,Integer> map= integerList.stream().collect(Collectors.toMap(i->i, i->i*i));
        System.out.println(map);
    }
}

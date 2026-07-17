package java8Example;

//41.convert a list of dates into a map where the key is the year and the value is a list of dates in that year.

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example41 {
    static void main() {
        List<LocalDate> dateList = List.of(
                LocalDate.of(2024, 1, 15),
                LocalDate.of(2024, 6, 20),
                LocalDate.of(2025, 3, 10),
                LocalDate.of(2025, 12, 25),
                LocalDate.of(2026, 5, 1),
                LocalDate.of(2026, 7, 17)
        );

Map<Integer,List<Integer>> map=      dateList.stream().collect(Collectors.groupingBy(LocalDate::getYear,Collectors.mapping(LocalDate::getDayOfMonth,Collectors.toList())));

        System.out.println("map = " + map);}
}
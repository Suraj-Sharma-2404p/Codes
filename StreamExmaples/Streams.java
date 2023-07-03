package StreamExmaples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream().filter(x -> x.isEmpty()).count();
        List<String> strList2 = strList.stream().filter(x -> x.isEmpty()).collect(Collectors.toList());
        long num = strList.stream().filter(x -> x.length()>3).count();
        long num2 = strList.stream().filter(x -> x.startsWith("a")).count();
        List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        List<String> filtered2 = strList.stream().filter(x -> x.length()>2).collect(Collectors.toList());
        System.out.println(count);
        System.out.println(strList);
        System.out.println(strList2);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(filtered);
        System.out.println(filtered2);

        //map examples
        List<String> country = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        List<String> g7CountryInLilst = country.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        String g7countries = country.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(g7countries);
        System.out.println(g7CountryInLilst);

        //Create a List of the square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> ans = numbers.stream().distinct().map(x -> x*x).collect(Collectors.toList());
        System.out.println(ans);

        //Get count, min, max, sum, and the average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats);

    }
}

package StreamExmaples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        // fetch second smallest from an array
        int[] arr = new int[]{6,1,2,4,5,1};
        Integer first = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Not found!!"));
        System.out.println(first);

        //find common element from two array of integers

        int[] arr1 = new int[]{6,1,2,4,5,1,7};
        int[] arr2 = new int[]{5,1,1,7};
        List<Integer> commonInteger = Arrays.stream(arr1).distinct().filter(element -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == element)).boxed().collect(Collectors.toList());
        System.out.println(commonInteger);

        //find duplicate element in a list
        int[] myList2 = new int[]{10,15,8,49,25,98,98,32,15};
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicateElem  = Arrays.stream(myList2).filter(x -> !set.add(x)).boxed().collect(Collectors.toList());
        System.out.println("duplicate elements are: "+duplicateElem);

        //program to reverse an array
        int[] arraytoreverse = new int[]{1,2,3,4,5};
        IntStream.range(0,arraytoreverse.length/2).forEach(i ->{
            int temp = arraytoreverse[i];
            arraytoreverse[i] = arraytoreverse[arraytoreverse.length-i-1];
            arraytoreverse[arraytoreverse.length-i-1] = temp;
        });
        System.out.println(Arrays.toString(arraytoreverse));

        //find the length of longest string in string array
        String[] strings = {"Apple","Avocado","Orange","Apricot"};
        int maxLength = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
        System.out.println("The length of longest String is : "+maxLength);

        //find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> startswith1 = myList.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println("NUmbers starting with one: "+startswith1);


        //find the first element of the list using Stream functions?
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer integer = myList3.stream().findFirst().orElseThrow(() -> new IllegalArgumentException("not present!!"));
        myList3.stream().findFirst().ifPresent(System.out::println);
        System.out.println(integer);

        //find the total number of elements present in the list using Stream functions?
        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count1 = myList4.stream().count();
        System.out.println(count1);

        //find the maximum value element present in it using Stream functions?
        List<Integer> myList5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer first1 = myList5.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow(() -> new IllegalArgumentException("error"));
        Integer first2 = myList5.stream().max(Integer::compare).get();
        System.out.println(first1);
        System.out.println(first2);

        // find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";
        Character chars = input.chars()   //stream of chars
                .mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1l)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(chars);

        //find the first repeated character in it using Stream functions?
        String input2 = "Java articles are Awesome";
        Character character = input2.chars()
                .mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1l)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(character);

        //return true if any value appears at least twice in the array, and return false if every element is distinct.


    }
}

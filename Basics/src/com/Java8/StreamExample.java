package com.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,5,15,20,35);
//        List<Integer> filteredList = list.stream().filter(ele -> ele%2==0).collect(Collectors.toList());
        List<Integer> filteredList = list.stream().filter(ele -> ele%2==0).toList();
        System.out.println(filteredList);

        List<Integer> squareList = list.stream().map(ele -> ele*ele).toList();
        System.out.println(squareList);

        System.out.println(list.stream().allMatch(ele -> ele>10));
        System.out.println(list.stream().anyMatch(ele -> ele>10 && ele%2==0));

        System.out.println(list.stream().distinct().toList()); // return unique element only

//        List<Integer> sortedArray = list.stream().sorted().toList(); for ascending
//        List<Integer> sortedArray = list.stream().sorted((a,b) -> b-a).toList(); //
        List<Integer> sortedArray = list.stream().sorted(Comparator.reverseOrder()).toList(); // desc
        System.out.println(sortedArray);

        List<String> stringList = Arrays.asList("A","BB","AAA","C","BBBB");
//        System.out.println(stringList.stream().sorted().toList());
//        System.out.println(stringList.stream().sorted((a,b) -> -a.compareTo(b)).toList());
        System.out.println(stringList.stream().sorted((a,b) -> b.length()-a.length()).toList());

        list.forEach(System.out::println);
        System.out.println();

        Integer mn = list.stream().min((a,b) -> a-b).get();
        Integer mx = list.stream().max((a,b) -> a-b).get();
        System.out.println(mn + " " + mx);

        Stream<?> item = Stream.of(10,87.50,"Pankaj",'c',8989384018401L);
        System.out.println();
        item.map(i -> i+":s").forEach(System.out::println);

    }
}

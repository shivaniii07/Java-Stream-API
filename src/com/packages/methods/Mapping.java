package com.packages.methods;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(2,4,5,1,3);
        List<Integer> newList=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newList);

        //PRINT THE ELMENTS FROM THE NEWlIST
      //   newList.stream().forEach(System.out::println);
    }
}

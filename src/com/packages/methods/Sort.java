package com.packages.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {

        List<String> names= List.of("Shivani","Raj","Pearl","Ajay","Kajal");
        names.stream().sorted().forEach(System.out::println);

        //min() method of stream api
        List<Integer> numbers=List.of(2,5,8,1);
        //single method so we are using get function to get the value
      Integer integer=numbers.stream().min((x, y)->x.compareTo(y)).get();
        System.out.println("min"+" "+integer);
//
       //flatmap() method of stream api
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Ajay", "Aditya", "Aman", "Abhay"),
                Arrays.asList("Phool", "Pearl", "Pankhuri"),
                Arrays.asList("Shiv", "Shiva", "Shivani")
        );

       listOfList.stream()
               .flatMap(List::stream)
              .forEach(System.out::print);


    }
}



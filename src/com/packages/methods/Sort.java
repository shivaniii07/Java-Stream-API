package com.packages.methods;

import java.util.List;
import java.util.Optional;

public class Sort {
    public static void main(String[] args) {

        List<String> names= List.of("Shivani","Raj","Pearl","Ajay","Kajal");
        names.stream().sorted().forEach(System.out::println);

        List<Integer> numbers=List.of(2,5,8,1);

        //single method so we are using get function to get the value
        Integer integer=numbers.stream().min((x, y)->x.compareTo(y)).get();
        System.out.println("min"+" "+integer);

    }
}

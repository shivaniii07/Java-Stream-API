package com.packages.methods;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> names= List.of("Shivani","Aman","Pearl","Aditya","Ajay");
         List<String> newList=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newList);
    }
}

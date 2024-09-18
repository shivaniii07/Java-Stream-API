package com.packages.streamobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

      //ways by which we can create streams

     //1-blank
     Stream<Object> emptyStream= Stream.empty();
     //     emptyStream.forEach(e->{
    //         System.out.println(e);
    //     });

     //2-array,object collection
        String names[]={"Hyy","Hello","Jack","shiv"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

      //3-streamBuilder method
      Stream<Object> streamBuider=Stream.builder().build();

//      4
        IntStream stream= Arrays.stream(new int[]{2,65,4,3});
        stream.forEach(e->{
            System.out.println(e);
        });

        // 5 how to make object of List,Set
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(14);
        list1.add(21);
        list1.add(44);

        Stream<Integer> stream2= list1.stream();
        stream2.forEach(i->{
            System.out.println(i);
        });
    }
}

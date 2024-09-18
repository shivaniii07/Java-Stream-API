package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

//        create a list and filter all even numbers from the list

        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(34);
        list1.add(27);
        list1.add(38);
        list1.add(79);

       // Stream<Integer> stream=list1.stream();
       //  List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
       // System.out.println(newList);

        List<Integer> newList=list1.stream().filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

//        to filter all the elements greater than 20 from the list

        List<Integer> newList1=list1.stream().filter(i-> i>20).collect(Collectors.toList());
        System.out.println(newList1);
    }
}

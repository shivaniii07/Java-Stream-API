package realWorldExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentOperation {

    List<Student> students=Arrays.asList(
       new Student("Shivani",14),
       new Student("Pearl",19),
       new Student("Kajal",12),
       new Student("Aditya",18)
    );

    //given a list of students,get student having age greater than 15
    //map there names to a list
    //and arranged in alphabetical order

    public void processData(){

        List<String> names=students.stream().filter(student -> student.getAge()>15)
                .map(Student::getName).sorted().collect(Collectors.toList());
        for(String name:names)
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        StudentOperation s2=new StudentOperation();
        s2.processData();
    }

}

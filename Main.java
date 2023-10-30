package sITs;
import sITs.Person;
import sITs.Student;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Person person = new Person("Sasha", 18);
        Person person1 = new Person(person);
        //TODO: ...
        person1.birthday();
        //TODO: ...
        person.printInfo();
        person1.printInfo();
        System.out.println(person1.count);
        System.out.println(person.count);
        Person.printAnyPerson(person1);
        int res = Person.sum(9, 10);
        System.out.println(res);
        Math.abs(1-9);
    }
}

package sITs;

public class Person {
    private String name;
    private int age;
    public static int count = 0;
    public Person(String name, int age){
        if (age > 0 && age <= 200) {
            this.age = age;
        }else{
            this.age = 0;
        }
        this.name = name;
        count++;
    }
    public Person(Person person){
        this(person.name, person.age);
    }
    public void printInfo(){
        System.out.println("================");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println();
    }
    public int birthday(){
        age++;
        return age;
    }
    public static void printAnyPerson(Person person){
        System.out.println("================");
        System.out.println("Name : " + person.name);
        System.out.println("Age : " + person.age);
        System.out.println();
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
}

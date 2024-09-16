package se.oscar.scanner;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void Introduce() {
        System.out.println("Name: " + name + " Age: " + age + " Job: " + job);
    }

    public void setJob(String job) {
        this.job = job;
    }
}

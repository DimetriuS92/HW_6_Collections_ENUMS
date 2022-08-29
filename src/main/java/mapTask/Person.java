package mapTask;

import java.util.ArrayList;

public class Person {
    ArrayList<Account> accountsList = new ArrayList<>();
    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

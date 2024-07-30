package OOPS.Collection_Frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Animal{" + "age=" + age + ", name=" + name + ", weight=" + weight + "}\n";
    }

    @Override
    public int compareTo(Animal that) {
        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}



public class comparable {
    public static void main(String[] args) {
        Animal a1 = new Animal(4, "leo", 10);
        Animal a2 = new Animal(2, "bruno", 4);
        Animal a3 = new Animal(1, "maxo", 6);
        Animal a4 = new Animal(3, "don", 3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}

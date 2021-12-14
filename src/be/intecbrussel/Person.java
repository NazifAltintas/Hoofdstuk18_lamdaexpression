package be.intecbrussel;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private Gender gender;
    private float weight;
    private float length;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }
    public Person(Gender gender) {
        this.gender = gender;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Float.compare(person.getWeight(),
                getWeight()) == 0 && Float.compare(person.getLength(),
                getLength()) == 0 && Objects.equals(getName(),
                person.getName()) && Objects.equals(getLastName(),
                person.getLastName()) && getGender() == person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getAge(), getGender(), getWeight(), getLength());
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
}

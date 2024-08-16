package org.example;

public class Employee {
    String name;
    String surname;
    Buyer.Gender gender;

    public Employee(String name, String surname, Buyer.Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Buyer.Gender getGender() {
        return gender;
    }

    public void setGender(Buyer.Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Gender: " + gender;
    }
}

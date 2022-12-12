package Classes;

import Enums.Country;
import Enums.Gender;

import java.time.LocalDate;

public class Person {
    private String name;
    private String fullName;
    private LocalDate year;
    private Gender gender;
    private Country country;

    public Person(String name, String fullName, LocalDate year, Gender gender, Country country) {
        this.name = name;
        this.fullName = fullName;
        this.year = year;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", year=" + year +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }
}

package Classes;

import Enums.Country;
import Enums.Gender;

import java.time.LocalDate;

public class Passport {
    private int ID;
    private String name;
    private String FullName;
    private LocalDate dateOfBirth;
    private Country country;
    private Gender gender;


    public Passport(int ID, String name, String fullName, LocalDate dateOfBirth, Country country, Gender gender) {
        this.ID = ID;
        this.name = name;
        FullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", FullName='" + FullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", country=" + country +
                ", gender=" + gender +
                '}';
    }
}

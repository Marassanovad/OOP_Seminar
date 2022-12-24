package Seminar1;

import java.util.List;

public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private String birthDate;
    private Integer id;



    public Human(String firstName, String lastName, String gender, String birthDate, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.id = id;
    }

    public Human() {

    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                ", gender: " + gender +
                ", birthDate: " + birthDate;
    }

    public String toString(List<Human> family) {
        return "Name: " + firstName + " " + lastName +
                ", gender: " + gender +
                ", birthDate: " + birthDate;
    }
}

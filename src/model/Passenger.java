package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Passenger {
    private final long id;
    private String name;
    private String surname;
    private int age;
    private LocalDate birthdate;
    private String phoneNumber;
    private String email;
    private String passportNumber;
    private String gender;
    private BigDecimal balance;
    private long tickedId;
    private int seatNumber;

    public Passenger(long id, String name, String surname, int age, LocalDate birthdate, String phoneNumber,
                     String email, String passportNumber, String gender, BigDecimal balance, long tickedId,
                     int seatNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passportNumber = passportNumber;
        this.gender = gender;
        this.balance = balance;
        this.tickedId = tickedId;
        this.seatNumber = seatNumber;
    }

    public long getId() {
        return id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public long getTickedId() {
        return tickedId;
    }

    public void setTickedId(long tickedId) {
        this.tickedId = tickedId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthdate=" + birthdate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", gender=" + gender +
                ", balance=" + balance +
                ", tickedId=" + tickedId +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}

package model;

import java.util.Date;

/**
 * Created by Дмитрий on 27.06.2016.
 */
public class Account {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private Date birthday;
    private double balance;

    public Account() {
    }

    public Account(String name, String surname, String patronymic, Date birthday, double balance) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.balance = balance;
    }

    public Account(String id, String name, String surname, String patronymic, Date birthday, double balance) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.balance = balance;
    }

    public void cashWithdrawal(double amount) {

    }

    public double getBalance() {
        return balance;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ",   patronymic='" + patronymic + '\'' +
                ", balance=" + balance +
                '}';
    }
}
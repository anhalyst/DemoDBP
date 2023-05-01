package com.example.demo;

import jakarta.persistence.*;

public class Person {

    private int euid;
    private String nickname;
    private String surname;
    private String first_name;
    private String date_of_birth;


    public int getEuid() {
        return euid;
    }

    public void setEuid(int euid) {
        this.euid = euid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDateOfBirth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return String.format(
                "Person[id=%d, nickname='%s', firstName='%s', lastName='%s', birthday='%s']",
                euid,nickname, first_name, surname,date_of_birth);
    }}

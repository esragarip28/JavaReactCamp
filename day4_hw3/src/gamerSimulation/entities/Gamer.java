package gamerSimulation.entities;

import gamerSimulation.abstracts.Entity;

public class Gamer implements Entity {

    private int id;
    private String name;
    private String surname;
    private String nickName;
    private int birthYear;
    private String NationalityId;

    public Gamer(int id, String name, String surname, String nickName, int birthYear, String nationalityId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
        this.birthYear = birthYear;
        NationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}

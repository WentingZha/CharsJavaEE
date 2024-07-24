package com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean;

public class Card {
    private Integer id;
    private String number;

    private Person p;

    public Card() {
    }

    public Card(Integer id, String number, Person p) {
        this.id = id;
        this.number = number;
        this.p = p;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", p=" + p +
                '}';
    }
}

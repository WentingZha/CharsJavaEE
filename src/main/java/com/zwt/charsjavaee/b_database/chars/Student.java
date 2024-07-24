package com.zwt.charsjavaee.b_database.chars;

public class Student implements StudentInterface {

    private String name;
    private String age;
    private String score;

    public Student() {
    }

    public Student(String name, String age, String score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void askQuestion() {
        System.out.println("Ask a question");
    }

    public void study() {
        System.out.println("Study Math");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }


}

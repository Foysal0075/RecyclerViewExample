package com.codex.recyclerviewexample;

public class Person {
    private String name;
    private String location;
    private String profession;

    public Person(String name, String location, String profession) {
        this.name = name;
        this.location = location;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getProfession() {
        return profession;
    }

}

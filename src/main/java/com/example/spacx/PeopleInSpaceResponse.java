package com.example.spacx;

import java.util.List;

public class PeopleInSpaceResponse {
    private String message;
    private int number;
    private List<Person> people;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }



    public static class Person {
        private String name;
        private String craft;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCraft() {
            return craft;
        }

        public void setCraft(String craft) {
            this.craft = craft;
        }

    }
}


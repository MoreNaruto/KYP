package com.kyp.morenaruto.kyp.activities.cats;

public class Cat {
    private String name;
    private String breed;
    private String personality;

    public Cat() {
    }

    public Cat(String name, String breed, String personality) {
        this.name = name;
        this.breed = breed;
        this.personality = personality;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getPersonality() {
        return personality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }
}

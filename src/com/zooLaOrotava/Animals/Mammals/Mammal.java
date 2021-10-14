package com.zooLaOrotava.Animals.Mammals;

import com.zooLaOrotava.Animals.Animal;

public class Mammal extends Animal {



    public Mammal(String Name, int Age, String Gender, double weight, String habits, double Speed, String diet) {
        super(Name, Age, Gender);
        this.weight = weight;
        this.habits = habits;
        this.Speed = Speed;
        this.diet = diet;

    }

    public double weight;
    public String habits;
    public double Speed;
    public String diet;

    public double getWeight() {
        return weight;
    }

    public String getHabits() {
        return habits;
    }

    public Mammal setHabits(String habits) {
        this.habits = habits;
        return this;
    }

    public double getSpeed() {
        return Speed;
    }

    public String getDiet() {
        return diet;
    }

    public Mammal setDiet(String diet) {
        this.diet = diet;
        return this;
    }

    public static double obtWeight(){
        return Math.random()*40;
    }
    public static double obtSpeed() {
        return (Math.random() * 10);
    }

    public static String obtainSexAnimal(){
        return Animal.getSex();
    }
}
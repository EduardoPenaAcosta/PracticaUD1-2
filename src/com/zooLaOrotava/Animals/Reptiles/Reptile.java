package com.zooLaOrotava.Animals.Reptiles;

import com.zooLaOrotava.Animals.Animal;

public class Reptile extends Animal {
    private String Gender;
    private double CorpTemp;
    protected String Color;
    private double Speed;

    public Reptile(String name, int age, String sex, double CorpTemp, String Color, double Speed) {
        super(name, age, sex);

        this.CorpTemp = CorpTemp;
        this.Color = Color;
        this.Speed = Speed;
    }

    public enum Color{
        Red,Blue,White,Green,Yellow,Black,Orange
    }

    public String getGender(){
        return Gender;
    }

    public Reptile setGender(String gender) {
        Gender = gender;
        return this;
    }
    public static double getCorpTemp(){
        return Math.random()*40;
    }

    public String getColor() {
        return Color;
    }

    public String setColor(String color) {
        Color = color;
        return Color;
    }

    public double getSpeed() {
        return Speed;
    }

    public Reptile setSpeed(double speed) {
        Speed = speed;
        return this;
    }
}

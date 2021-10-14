package com.zooLaOrotava.Animals.Reptiles;

public class SeaTurtle extends Reptile{

    public SeaTurtle(String name, int age, String sex, double CorpTemp, String Color, double Speed) {
        super(name, age, sex, CorpTemp, Color, Speed);
    }

    public void PrintSeaTurtle(){
        System.out.println("Chamaleon -->   Name:" + obtainName() + "Age: " + getAge() +  " Sex: " + getSex()
                + " CorpTemp: " + getCorpTemp() + " Color: " + getColor() + "Speed:" + getSpeed());

    }
}

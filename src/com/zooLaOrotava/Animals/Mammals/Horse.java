package com.zooLaOrotava.Animals.Mammals;


public class Horse extends Mammal {

    public Horse(String Name, int Age, String Gender, double weight, String habits, double Speed, String diet) {
        super(Name, Age, Gender, weight, habits, Speed, diet);
    }

    public void PrintHorse(){
        System.out.println("Horse --> " + obtainName() + "  Age: " + this.Age + "  Sex: " + this.Sex +
                "  Weight: " + this.weight + "  Habits: " + this.habits + " Speed: " + this.Speed +
                "  Diet:" + this.diet);
    }
}

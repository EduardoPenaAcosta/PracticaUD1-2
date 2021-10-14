package com.zooLaOrotava.Animals.Mammals;

public class Whale extends Mammal{
    public Whale(String Name, int Age, String Gender, double weight, String habits, double Speed, String diet) {
        super(Name, Age, Gender, weight, habits, Speed, diet);
    }

    public void PrintWhale(){
        System.out.println("Horse --> " + obtainName() + "  Age: " + getAge() + "  Sex: " + getSex() +
                "  Weight: " + this.weight + "  Habits: " + this.habits + " Speed: " + this.Speed +
                "  Diet:" + this.diet);
    }

}

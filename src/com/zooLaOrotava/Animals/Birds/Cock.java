package com.zooLaOrotava.Animals.Birds;

public class Cock extends Bird{
    public Cock(String name, int age, String sex, double altitude, String color) {
        super(name, age, sex, altitude, color);
    }

    public void PrintCock(){
        System.out.println("Cock -->  Name:" + obtainName() + "  Sex:" + getSex() + "Age: " + getAge() +
                "  Altitude: " + this.Altitude + "  Color: " + this.color );
    }
}

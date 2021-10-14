package com.zooLaOrotava.Animals.Birds;

import com.zooLaOrotava.Animals.Animal;

public class Bird extends Animal {

    protected String name;
    protected String sex;
    protected String Gender;
    protected double Altitude;
    protected String color;
    protected String Paw;

    public Bird(String name, int age, String sex, double altitude, String color) {
        super(name, age, sex);
    }



    public double getAltitude() {
        return Altitude;
    }

    public static enum difPaw{
        Garra, Palmipedo
    }

    public void setPaw(String Paw){
        Paw = Paw.toString();
    }

    public double setAltitude(){
        return Altitude  = (Math.random()*100);
    }

    public static enum difColor{
        White, Green, Blue, Red, Orange, Grey, Black
    }

    public void setColor(difColor color){
        color = color;
    }

    public static enum difSex{
        Male,Female
    }

    public void setSex(difSex sex){
        sex = sex;
    }

    public static double obtAltitude(){
        return Math.random()*2000;
    }

}

package com.zooLaOrotava.Animals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Animal {

    protected String name;
    protected String Name;
    protected int Age;
    protected String Sex;

    public Animal(String name, int age, String sex) {
        Name = name;
        Age = age;
        Sex = sex;
    }

    public String getName() {
        Name = obtainName();
        return Name;
    }

    public static String obtainName(){

        String nameList[] = {"Tifón","Elbicho","Mango","Piña","Juan","Yasuo","Misifú","Bobon","Rantanplán","Harambe","Chimuelo","Yogu","Petisuí","Brego","Eren YEGA","Tora","Rufus"};
        return nameList[(int) Math.random()* 16];
    }

    public static String getSex(){
        Random r = new Random();
        String[] sexo = new String[2];
        sexo[0] = "Femenino";
        sexo[1] = "Masculino";
        String ObtSex = sexo[r.nextInt(1)];

        return ObtSex;
    }

    public static String obtSex(String Sex){
        return Sex;
    }


    public static int getAge(){
        int Age = (int) Math.random() * 15;
        return Age;
    }


    public String returnSex() {
        return Sex;
    }
}

package com.zooLaOrotava.Zoo;

import com.zooLaOrotava.Animals.Animal;
import com.zooLaOrotava.Animals.Birds.*;
import com.zooLaOrotava.Animals.Mammals.*;
import com.zooLaOrotava.Animals.Reptiles.*;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class MainZoo {

    public static int Espaces;
    public static int Animals;

    public MainZoo(int espaces, int animals) {
        Espaces = espaces;
        Animals = animals;
    }

    public static int getEspaces() {
        return Espaces;
    }

    public static int getAnimals() {
        return Animals;
    }

    public static void main(String[] args) {
        
        int Espaces = getEspaces();
        int countAnimals = getAnimals();
        
        ArrayList<BlackBird> GeneratedBlackBird = new ArrayList<BlackBird>();
        ArrayList<Cock> GeneratedCock = new ArrayList<Cock>();
        ArrayList<Whale> GeneratedWhale = new ArrayList<Whale>();
        ArrayList<Horse> GeneratedHorse = new ArrayList<Horse>();
        ArrayList<Chameleon> GeneratedChameleon = new ArrayList<Chameleon>();
        ArrayList<SeaTurtle> GeneratedSeaTurtle = new ArrayList<SeaTurtle>();

        Random randomNumber = new Random();


        for(int i = 0; i < countAnimals; i++) {
            
            int MySelectionAnimal = randomNumber.nextInt(6);

            if(MySelectionAnimal == 0){

                Chameleon chamaleon = new Chameleon(Animal.obtainName(), Animal.getAge(), Animal.getSex(),Reptile.getCorpTemp(), "Red", Reptile.getCorpTemp() );
                GeneratedChameleon.add(chamaleon);

            }else if(MySelectionAnimal == 1){

                SeaTurtle Turtle = new SeaTurtle(Animal.obtainName(), Animal.getAge(), Animal.getSex(), Reptile.getCorpTemp(), "Blue", Reptile.getCorpTemp());
                GeneratedSeaTurtle.add(Turtle);

            }else if(MySelectionAnimal == 2){

                Whale whale = new Whale(Animal.obtainName(), Animal.getAge(), Animal.getSex(), Mammal.obtWeight(), "Diurno", Mammal.obtSpeed(), "Herviboro");
                GeneratedWhale.add(whale);

            }else if(MySelectionAnimal == 3){

                Horse horse = new Horse(Animal.obtainName(), Animal.getAge(), Animal.getSex(), Mammal.obtWeight(), "Nocturno", Mammal.obtSpeed(), "Omnivoro");
                GeneratedHorse.add(horse);

            }else if(MySelectionAnimal == 4){

                BlackBird blackbird = new BlackBird(Animal.obtainName(), Animal.getAge(), Animal.getSex(), Bird.obtAltitude(), "Red");
                GeneratedBlackBird.add(blackbird);

            }else {

                Cock cock = new Cock(Animal.obtainName(), Animal.getAge(), Animal.getSex(),Bird.obtAltitude(),"Blue" );
                GeneratedCock.add(cock);

            }

            for(int x = 0; x <= countAnimals; x++){
                for (int y = 1; y <= countAnimals;y++){

                    String compareSexBlackBird = GeneratedBlackBird.get(x).returnSex();
                    String compareSexBlackBird2 = GeneratedBlackBird.get(y).returnSex();

                    String compareSexCock = GeneratedCock.get(x).returnSex();
                    String compareSexCock2 = GeneratedCock.get(y).returnSex();

                    String compareSexHorse = GeneratedHorse.get(x).returnSex();
                    String compareSexHorse2 = GeneratedHorse.get(y).returnSex();

                    String compareSexWhale = GeneratedWhale.get(x).returnSex();
                    String compareSexWhale2 = GeneratedWhale.get(y).returnSex();

                    String compareSexChamaleon = GeneratedChameleon.get(x).returnSex();
                    String compareSexChamaleon2 = GeneratedChameleon.get(y).returnSex();

                    String compareSexSeaTurtle = GeneratedSeaTurtle.get(x).returnSex();
                    String compareSexSeaTurtle2 = GeneratedSeaTurtle.get(y).returnSex();



                    if(compareSexBlackBird == compareSexBlackBird2){
                        Espaces--;
                        System.out.println("------- Espace " + x + " ---------");
                        System.out.println(GeneratedBlackBird.get(x));
                        System.out.println(GeneratedBlackBird.get(y));
                        System.out.println("----------------------------------------");
                    }else{
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedBlackBird.get(x));
                        System.out.println("----------------------------------------");
                    }

                    if(compareSexCock == compareSexCock2){
                        Espaces--;
                        System.out.println("------- Espace " + x + " ---------");
                        System.out.println(GeneratedCock.get(x));
                        System.out.println(GeneratedCock.get(y));
                        System.out.println("----------------------------------------");
                    }else{
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedCock.get(x));
                        System.out.println("----------------------------------------");
                    }

                    if(compareSexHorse == compareSexHorse2){
                        Espaces--;
                        System.out.println("------- Espace " + x + " ---------");
                        System.out.println(GeneratedHorse.get(x));
                        System.out.println(GeneratedHorse.get(y));
                        System.out.println("----------------------------------------");

                    }else{
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedHorse.get(x));
                        System.out.println("----------------------------------------");
                    }

                    if(compareSexWhale == compareSexWhale2){
                        Espaces--;
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedWhale.get(x));
                        System.out.println(GeneratedWhale.get(y));
                        System.out.println("----------------------------------------");

                    }else{
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedWhale.get(x));
                        System.out.println("----------------------------------------");
                    }

                    if(compareSexChamaleon == compareSexChamaleon2){
                        Espaces--;
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedChameleon.get(x));
                        System.out.println(GeneratedChameleon.get(y));
                        System.out.println("----------------------------------------");
                    }else{
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedChameleon.get(x));
                        System.out.println("----------------------------------------");
                    }

                    if(compareSexSeaTurtle == compareSexSeaTurtle2){
                        Espaces--;
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedSeaTurtle.get(x));
                        System.out.println(GeneratedSeaTurtle.get(y));
                        System.out.println("----------------------------------------");
                    }else{
                        System.out.println("---------------Espace" + x + "----------");
                        System.out.println(GeneratedSeaTurtle.get(x));
                        System.out.println("----------------------------------------");
                    }




                }
                
            }


        }









    }



}

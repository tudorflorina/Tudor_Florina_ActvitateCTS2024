package model;

import java.util.HashMap;

public class Main {
    public enum FeedType{
        OMNIVOR,
        IERBIVOR,
        CARNIVOR

    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper=new ZooKeeper("George");

        Zoo zoo=new Zoo("Zoo1",zooKeeper,new HashMap<>());
        Animal animal1 = new Lion("Marele Leu",5);

        Animal animal2 = new Zebra("Marty",13);
        Animal animal3 = new Cat("Fury",13);


        zoo.addAnimal(animal2,"grass");
        zoo.addAnimal(animal1,"meat");
        zoo.addAnimal(animal3,"pliculet");

        zoo.feedAllAnimals();

        FeedType feedType=FeedType.CARNIVOR;

    }

}
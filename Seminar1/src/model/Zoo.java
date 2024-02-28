package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private Map<Animal,String> animals;


    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal,String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    public Map<Animal,String> getAnimals() {
        return animals;
    }

    public void setAnimals(Map<Animal,String> animals) {
        this.animals = animals;
    }

    public void feedAllAnimals(){
        for( var a: animals.entrySet()){
            zooKeeper.feedAnimal(a.getKey(),a.getValue());
        }

    }

    public void addAnimal(Animal animal, String food) {
        if (animals == null)
            {
                animals=new HashMap<>();
            }
            animals.put(animal, food);

    }
}

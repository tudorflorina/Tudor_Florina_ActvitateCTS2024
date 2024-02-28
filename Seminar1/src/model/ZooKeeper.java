package model;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal, String food){
       animal.eat(food);
        // System.out.println("Animalul "+animal+ " a fost hranit de "+this.getName()+" cu "+food);
    }

}

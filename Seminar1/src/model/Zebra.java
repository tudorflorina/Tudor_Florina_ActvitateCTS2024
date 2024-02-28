package model;

public class Zebra extends Animal{


    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("This zebra "+this.getName()+" eats "+food);
    }
}

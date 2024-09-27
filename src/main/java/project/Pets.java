package project;

import java.util.Scanner;

public abstract class Pets {

    String name;

    public Pets(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract String speak();

}
class Dog extends Pets {
    public Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Woof";

    }
    public class Cat extends Pets {
        public Cat(String name) {
            super(name);
        }
        @Override
        public String speak(){
            return "Purr";
        }
    }
    public class Bird extends Pets {
        public Bird(String name) {
            super(name);
        }
        @Override
        public String speak(){
            return "Chirp";
        }
    }

}


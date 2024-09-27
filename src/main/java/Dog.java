import project.Pets;

public class Dog extends Pets {
    public Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Woof";

    }
}

import project.Pets;

public class Bird extends Pets {
    public Bird(String name) {
        super(name);
    }
    @Override
    public String speak(){
        return "Chirp";
    }
}


package project;
//Ask the user how many pets they have. //create a scanner
//how many pets they have //
// what kind of pet each one is; dog, cat, bird
// along with each pet's name; billy, bob, echo
//store the pets list
//hold onto the user input (
//print out the list at the end w/pet name and sound they make

//Part 2:
//Create a Pet class
// create a subclass for each type of pet that you want your program to support.
// Follow the following requirements:
//Must support at least three types of pets.
//Dog must be one of the types you support.
//Cat must be one of the types you support.
//Bird will be the third type
//Pet class must have a speak method that each subclass overrides.
// Create method for each subclass and ages of the pets
//Pet class must have a name field with setters and getters.

//Part 3:
//Modify your program from part 1 to use the Pet class and its subclasses.
//Keep a list of the pets your user lists
//At end of program print out a list of their names and what they say when they speak

//create 3 scanners
//each scanner must follow subclass
//-------------------------------------------------------------------------------------------------

import java.util.Scanner; //add a scanner

public abstract class Pets {

    public String name;

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
        class Cat extends Pets {
            public Cat(String name) {
                super(name);
            }
            @Override
            public String speak(){
                return "Purr";
            }
        }
        class Bird extends Pets {
            public Bird(String name) {
                super(name);
            }
            @Override
            public String speak(){
                return "Chirp";
            }
        }

    }
public class Main {
    public static void main(String[] args) { //scanner portion
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask how many pets
        System.out.print("How many pets do you have? ");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        // Step 2: Collect information about each pet
        Pets[] pets = new Pets[numberOfPets];


        for (int p = 0; p < numberOfPets; p++) {
            System.out.print("What kind of pet is pet #" + (p + 1) + "? ");
            String petTypes = scanner.nextLine().toLowerCase();

            System.out.print("What is the name of pet #" + (p + 1) + "? ");
            String petNames = scanner.nextLine();

            switch (petTypes) {
                case "dog":
                    pets[p] = new Dog(petNames);
                    break;
                case "cat":
                    pets[p] = new Cat(petNames);
                    break;
                case "bird":
                    pets[p] = new Bird(petNames);
                    break;
                default:
                    System.out.println("Unknown pet type, use common pet");
                    pets[p] = new Dog(petNames);
                    break;
            }
        }

        // Step 3: Store and print the list of pets
        System.out.println("\nYour pets and the sounds they make:");

          for (Pets pet : pets) {
        System.out.println(pet.getName() + " says " + pet.speak());
        }
        scanner.close();
        }
    }








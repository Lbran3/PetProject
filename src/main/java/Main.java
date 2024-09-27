//Part 1: Get the number of pets and their details
//-initialize scanner (import java.util.Scanner)
//-ask the user: "How many pets do you have?"
//-store the number of pets, utilizing an int
//-use a loop to go through the number of pets:
//-for each pet, ask: What kind of pet is this (bird, dog, cat)?
//-ask what’s the name of the pet
//-store the pet's type and name
//-at the end, print out the list of pets and their names.
//
//Part 2: Create a Pet class and subclasses
//Create a Pet class:
//-create name for class
//-create a setter and getter for name.
//-create a speak method in Pet (this will be overridden in subclasses).
//Create subclasses for specific pet types (mine: dog, cat, bird):
//-in each subclass, override the speak method (@Override) with sound for that pet
//Ex:
//-dog: speaks "Woof!"
//-cat: speaks "Purr!"
//bird: speaks "Chirp!"
//

//Part 3: Modify the program to use the Pet class
//-ask user (ex. part 1) for number of pets and their details (type and name)
//Create an empty list to store pet:
//-loop through the number of pets
//-based on the pet type (dog, cat, bird), create subclass each pet type (dog, cat, bird)
//-set the pet's name using the setter
//-add the pet object to the list
//at the end, loop through the list of pets and,
//-print each pet's name
//-call the speak method to print the sound the pet makes
import project.Pets;

import java.util.Scanner;

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
                String name = scanner.nextLine();

                switch (petTypes) {
                    case "dog":
                        pets[p] = new Dog(name);
                        break;
                    case "cat":
                        pets[p] = new Cat(name);
                        break;
                    case "bird":
                        pets[p] = new Bird(name);
                        break;
                    default:
                        System.out.println("Unknown pet type, use common pet");
                        pets[p] = new Dog(name);
                        break;
                }
            }

            // Step 3: Store and print the list of pets
            System.out.println("\nYour pets and the sounds they make:");

            for (Pets pet : pets) {
                System.out.println(pet.getName() + " says " + pet.speak());
            }

        }
    }

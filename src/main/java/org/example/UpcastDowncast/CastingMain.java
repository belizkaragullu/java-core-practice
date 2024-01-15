package org.example.UpcastDowncast;

public class CastingMain {
    public static void main(String[] args) {

        //Upcasting
        //Dog is a subclass of animal
        Animal myDogAnimal = new Dog();

        Animal animal = new Animal();

        animalMethod(myDogAnimal); //calls dog method
        animalMethod(animal); //calls animal(super) method

        // You can't call dog methods that doesnt exist in animal(super class)
        // myAnimal.dogMethod();

        downCastDog(myDogAnimal);
    }

    public static void animalMethod(Animal animal){
        animal.makeNoise();
    }
    public static void downCastDog(Animal animal){

        if(animal instanceof Dog) {
            Dog mydog = (Dog) animal;
            mydog.dogMethod();
        }
    }
}

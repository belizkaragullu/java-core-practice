package org.example.UpcastDowncast;

public class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Hav");
    }

    public void dogMethod(){
        System.out.println("This is a specific method that exists in dog class.");
    }
}

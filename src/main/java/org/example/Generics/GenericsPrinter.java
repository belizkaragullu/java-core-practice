package org.example.Generics;

public class GenericsPrinter<T> {

    T thingToPrint;

    public GenericsPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}

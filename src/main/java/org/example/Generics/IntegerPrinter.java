package org.example.Generics;

public class IntegerPrinter {

    Integer integerToPrint;

    public IntegerPrinter(Integer integerToPrint) {
        this.integerToPrint = integerToPrint;
    }

    public void print(){
        System.out.println(integerToPrint);
    }
}

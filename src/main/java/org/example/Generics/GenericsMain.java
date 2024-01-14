package org.example.Generics;



public class GenericsMain {
    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(22);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(15.2);
        doublePrinter.print();

        GenericsPrinter<Integer> genericIntegerPrinter = new GenericsPrinter<>(55);
        genericIntegerPrinter.print();

        GenericsPrinter<Double> genericDoublePrinter = new GenericsPrinter<>(43.6);
        genericDoublePrinter.print();

        GenericsPrinter<String> genericStringPrinter = new GenericsPrinter<>("Beliz");
        genericStringPrinter.print();

    }
}
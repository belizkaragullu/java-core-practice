package org.example.Enums;

public class EnumMain {

    public static void main(String[] args) {
        //bir sınıftan uretilecek nesneleri sınırlamak istiyorsan enum


        //static variable kullanım
        System.out.println(Days.MONDAY.getDay());

        //enum kullanım
        System.out.println(EnumDay.WEDNESDAY.getDay());

        //enum sınıfından nesne uretilemez
        //EnumDay enumDay = new EnumDay(4);

        EnumDay.FRIDAY.getDayName();
    }
}

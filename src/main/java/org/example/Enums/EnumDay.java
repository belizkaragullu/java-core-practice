package org.example.Enums;

public enum EnumDay {
    MONDAY(1),
    TUEASDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int day;

    private EnumDay(int day){
        this.day=day;
    }

    public int getDay() {
        return day;
    }

    public void getDayName(){
        String day= null;
        switch (this.day){
            case 1:
                day= "MONDAY";
                break;
            case 2:
                day= "TUESDAY";
                break;
            case 3:
                day= "WEDNESDAY";
                break;
            case 4:
                day= "THURSDAY";
            case 5:
                day= "FRIDAY";
                break;
            case 6:
                day= "SATURDAY";
                break;
            case 7:
                day= "SUNDAY";
        }
        System.out.println(day);
    }
}

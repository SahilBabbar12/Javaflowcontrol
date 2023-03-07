package com.knoldus.task10;

public class AllWeekDays {
    enum Days{
        Monday,tuesday,wednesday,thursday,friday,saturday,sunday
    }
    public static void main(String[] args) {

        for (Days index:Days.values()) {
            System.out.println(index);
        }
    }
}

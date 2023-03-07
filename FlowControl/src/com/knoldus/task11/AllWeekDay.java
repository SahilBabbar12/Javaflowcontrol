package com.knoldus.task11;

public class AllWeekDay {
    enum Days{
        Monday,tuesday,wednesday,thursday,friday,saturday,sunday
    }
    public static void main(String[] args) {

        for (Days index: Days.values()) {
            System.out.println(index);
        }
    }
}

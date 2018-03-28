package com.company;


public class Main {

    static void Good(String s) {
        System.out.println(" Good, {0}! " + s);
    }

    static void Morning(String s) {
        System.out.println(" Morning, {0}! " + s);
    }

    public static void main(String[] args) {

        Action firstdel = Main::Good;
        firstdel.foo("s1");

        Action secondDel = Main::Morning;
        secondDel.foo("s2");

        Action multiDel = s -> {
            firstdel.foo(s);
            secondDel.foo(s);
        };

        Action multiMinusfirstdel = s -> {
            secondDel.foo(s);
        };

        System.out.println("Invoking delegate firstdel: ");
        firstdel.foo("A");

        System.out.println("Invoking delegate secondDel: ");
        secondDel.foo("B");

        System.out.println("Invoking delegate multiDel: ");
        multiDel.foo("C");

        System.out.println("Invoking delegate multiMinusfirstdel: ");
        multiMinusfirstdel.foo("D");

    }
}
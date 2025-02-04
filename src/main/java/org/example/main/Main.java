package org.example.main;

import org.example.classes.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("A", "B", "C");
        NoGenericMethods obj2 = new NoGenericMethods("C", "A", "B");
        NoGenericMethods obj3 = new NoGenericMethods("B", "C", "A");

        obj1.showValues();
        obj2.showValues();
        obj3.showValues();
    }
}
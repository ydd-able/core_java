package com.coder.homework3;

public class PersonFactory {

    public static Person createPerson(String type) {
        if ("man".equals(type)) {
            return new Man();
        }
        if ("women".equals(type)) {
            return new Women();
        }
        return null;
    }
}

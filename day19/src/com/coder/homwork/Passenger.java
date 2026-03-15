package com.coder.homwork;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Passenger {
    private String name;
    private String start;
    private String end;


    public Passenger(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}

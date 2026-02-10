package com.coder.hasa;

public class Monk {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void becomeMonk(Mountain mountain) {
        Temple temple = mountain.getTemple();
        if (temple.getArea() >= 1000) {
            System.out.println(name + "可以在" + mountain.getName() + temple.getName() + "出家");
        } else {
            System.out.println(name + "不在" + mountain.getName() + temple.getName() + "出家");
        }
    }

}

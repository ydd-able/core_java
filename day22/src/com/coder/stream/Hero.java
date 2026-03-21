package com.coder.stream;

import java.util.Objects;

/**
 * @author N1357
 * @date 2026/3/19
 * @project core_java
 */
public class Hero {
    private String name;
    private Integer blood;

    public Hero(String name, Integer blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Hero hero = (Hero) object;
        return Objects.equals(name, hero.name) && Objects.equals(blood, hero.blood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, blood);
    }
}

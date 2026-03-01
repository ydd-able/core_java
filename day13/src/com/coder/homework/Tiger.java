package com.coder.homework;

import java.util.Objects;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
public class Tiger implements Cloneable{
    private double height;
    private double weight;

    public Tiger() {
    }

    public Tiger(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Tiger tiger = (Tiger) object;
        return Double.compare(height, tiger.height) == 0 && Double.compare(weight, tiger.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public Object clone()  {
        try {
            return super.clone();//浅拷贝.
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
        }
        return null;//
    }
}

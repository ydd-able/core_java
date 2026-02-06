package com.coder.override;

public class Circle extends Graphics{
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;//区分形参和类成员属性名。
    }
    public void calcArea(){
        double d = Math.PI*r*r;
        System.out.println("圆形面积"+d);
    }
    public void calcPerimeter(){
        double perimeter = 2*Math.PI*r;
        System.out.println("圆形周长:"+perimeter);

    }
}

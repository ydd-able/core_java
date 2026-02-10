package com.coder.override;

public class Rect extends Graphics{
    private int length;
    private int wideth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWideth() {
        return wideth;
    }

    public void setWideth(int wideth) {
        this.wideth = wideth;
    }

    public void calcArea(){
        int area = length*wideth;
        System.out.println("长方形面积"+area);

    }
    public void calcPerimeter(){
        int perimeter = 2*(length+wideth);
        System.out.println("长方形周长"+perimeter);
    }

}

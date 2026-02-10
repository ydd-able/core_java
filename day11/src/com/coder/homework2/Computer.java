package com.coder.homework2;

public class Computer {
    private GraphicsCard graphicsCard;
    public Computer(){
        this.graphicsCard = new GraphicsCard(true,5);
    }
    public boolean canplayLOL(){
        return graphicsCard.getIndependent()&graphicsCard.getMemory()>=4;
    }
}

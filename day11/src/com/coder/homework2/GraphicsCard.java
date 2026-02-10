package com.coder.homework2;

public class GraphicsCard {
    private boolean independent;
    private int memory;

    public GraphicsCard(boolean independent, int memory) {
        this.independent = independent;
        this.memory = memory;
    }

    public boolean getIndependent() {
        return independent;
    }

    public int getMemory() {
        return memory;
    }

}

package com.coder.homework2;

public class Player {
    private String name;
    private Computer computer;

    public Player(String name){
        this.name = name;
        this.computer = new Computer();
    }
    public void playLOL(){
        if(computer.canplayLOL()){
            System.out.println(name+"可以玩英雄联盟");
        }else{
            System.out.println(name+"不可以玩英雄联盟");
        }
    }
}

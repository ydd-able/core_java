package com.coder.likea;

public interface Hero{
    void attack();
}
class Shooter implements Hero{
    @Override
    public void attack() {
        System.out.println("射手通过射箭的方式攻击防御塔");
    }
}
class Mage implements Hero{
    @Override
    public void attack(){
        System.out.println("法师通过施放法术攻击防御塔");
    }
}
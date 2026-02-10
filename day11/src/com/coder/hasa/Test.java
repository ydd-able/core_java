package com.coder.hasa;
//继承:白盒测试。
//组合:黑盒测试。
public class Test {
    public static void main(String[] args) {
        Temple temple = new Temple();
        temple.setName("少林寺");
        temple.setArea(2000);
        Mountain mountain = new Mountain();
        mountain.setName("嵩山");
        mountain.setTemple(temple);
        Monk monk = new Monk();
        monk.setName("觉远");
        monk.becomeMonk(mountain);

    }
}

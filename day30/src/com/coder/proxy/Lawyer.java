package com.coder.proxy;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class Lawyer implements Court{
    private Defendant defendant;

    public Lawyer(Defendant defendant) {
        this.defendant = defendant;
    }

    @Override
    public void litigate() {
        collect();
        defendant.litigate();
        System.out.println("辩护");
    }
    private void collect(){
        System.out.println("收集证据");
    }
    private void defend(){
        System.out.println("辩护");
    }

}

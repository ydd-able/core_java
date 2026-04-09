package com.coder.proxy;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class TestCourt {
    public static void main(String[] args) {
        Defendant defendant = new Defendant();
        Court court = new Lawyer(defendant);
        court.litigate();

    }
}

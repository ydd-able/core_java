package com.coder.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/12
 * @project core_java
 */
public class Machine {
    public static List<Poker> list;

    static {
        list = new ArrayList<>(54);//可以初始化容量，目的是存入所有牌。
        list.add(new Poker(1, "大王"));//泛型是Poker，所以可以new一个对象。
        list.add(new Poker(2, "小王"));
        String[] colors = {"黑桃", "红桃", "梅花", "方块"};
        String[] points = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        int index = 3;
        for (String color : colors) {
            for (String point : points) {
                list.add(new Poker(index++, color + point));//通过list来
            }
        }
    }

    public static void shuffle() {
        Collections.shuffle(list);
    }

    //发牌功能。
    public static void sendCard(List<Player> players) {
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                players.get(0).getPokers().add(list.get(i));//把第i张牌发给第一个人。
            }
            if (i % 3 == 1) {
                players.get(1).getPokers().add(list.get(i));
            }
            if (i % 3 == 2) {
                players.get(2).getPokers().add(list.get(i));
            }
        }
        players.get(3).getPokers().addAll(list.subList(list.size()-3,list.size()));

        for (Player player : players) {
            Collections.sort(player.getPokers(), new Comparator<Poker>() {
                @Override
                public int compare(Poker o1, Poker o2) {
                    return Integer.compare(o1.getIndex(),o2.getIndex());
                }
            });

        }
    }




public static void main(String[] args) {

    for (Poker poker : list) {
        System.out.print(poker + "\t");
    }
    shuffle();
    System.out.println();
    for (Poker poker : list) {
        System.out.print(poker + "\t");

    }
}
}



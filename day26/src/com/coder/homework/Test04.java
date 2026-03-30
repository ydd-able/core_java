package com.coder.homework;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
//有三个线程，线程1负责生产超级兵，线程2负责超级兵移动，
// 线程3攻击防御塔，必须要按给定顺序，依次执行5次。

public class Test04 {
    public static void main(String[] args) {
        HomeBase homeBase = new HomeBase();
        homeBase.setFlag(1);
        homeBase.setLoopNum(5);

        new Thread(()->{
            homeBase.product("生产超级兵",1,2);
        },"生产超级兵线程").start();
        new Thread(()->{
            homeBase.product("移动超级兵",2,3);
        },"移动超级兵线程").start();
        new Thread(()->{
            homeBase.product("攻击防御塔",3,1);
        },"攻击防御塔线程").start();

    }
}
class HomeBase{
    private int flag;//标识，用来记录哪一个线程执行。
    private int loopNum;//用来记录循环次数。

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getLoopNum() {
        return loopNum;
    }

    public void setLoopNum(int loopNum) {
        this.loopNum = loopNum;
    }
    public void product(String opName, int waitFlag,int nextFlag)  {
        for (int i = 1; i <= loopNum; i++) {
            synchronized(this){
                while(flag!=waitFlag){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+opName);
                flag = nextFlag;
                this.notifyAll();
            }

        }
        
    }
}
package com.coder.sync;

/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
public class TestThreadLocal {
    public static void main(String[] args) {
        testUseThreadLocal();
    }
    public static void testUseThreadLocal(){
        DataDemo1 demo = new DataDemo1();
        for (int i = 1; i <=5; i++) {
            new Thread(()->{
                demo.setData(Thread.currentThread().getName()+"的数据");
                System.out.println(Thread.currentThread().getName()+":获取"+demo.getData());
            }).start();
        }
    }
}
class DataDemo{
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class DataDemo1{
    ThreadLocal<String> local = new ThreadLocal<>();
    public String getData(){
        return local.get();
    }
    public void setData(String data){
        local.set(data);
    }

}
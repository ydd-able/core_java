package com.coder.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


/**
 * @author N1357
 * @date 2026/3/30
 * @project core_java
 */
//使用多线程实现消息队列，有三个线程负责生产消息，有一个线程负责读取消息，读取消息的线程每隔1秒读取1次。
//消息队列中只能存储2条消息，如果存储已满，则生产消息的线程等待，如果消息队列中没有消息，则读取消息的线程等待。


public class Test05 {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue(2);
        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                Message message = new Message(IdUtil.getId(), "消息信息" + IdUtil.getId());
                queue.put(message);
            }, "生产者" + i).start();
        }
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }, "消费者").start();
    }
}

class MessageQueue {
    private LinkedList<Message> list;
    private int capacity;//消息队列的容量
    private static final Object LOCK = new Object();

    public MessageQueue(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
    }

    public Message take() {
        synchronized (LOCK) {
            while (list.isEmpty()) {
                System.out.println("消息队列没有内容，消费者等待");
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            Message message = list.removeFirst();
            System.out.println("获取到一个消息:" + message);
            LOCK.notifyAll();
            return message;
        }
    }

    public void put(Message message) {
        synchronized (LOCK) {
            while (list.size() == capacity) {
                System.out.println("消息队列已满，生产者等待");
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            list.addLast(message);
            System.out.println("已经生产一个消息：" + message);
            LOCK.notifyAll();
        }
    }

}

class Message {
    private String id;
    private Object value;

    public Message(String id, Object value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }

}

class IdUtil {
    public static String getId() {
        return UUID.randomUUID().toString().replace("-", "");

    }
}
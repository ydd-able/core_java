package com.coder.array;

import javax.swing.event.CellEditorListener;
import java.util.Arrays;

public class MyArray {
    private Object[] elementData;//用来存储数据的数组
    private int size;//数组的实际长度。
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};

    public MyArray() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArray(int intialCapacity) {
        if (intialCapacity > 0) {
            elementData = new Object[intialCapacity];
        } else if (intialCapacity == 0) {
            elementData = new Object[]{};
        } else {
            throw new IllegalArgumentException("数组初始化参数异常：" + intialCapacity);
        }

    }

    //获取集合的实际大小。
    public int size() {
        return size;
    }

    public boolean add(Object obj) {
        add(obj, elementData, size);
        return true;
    }
    //在索引位置处插入数据
    public void add(int index , Object obj){
        if(index>size || index < 0){
            throw new IndexOutOfBoundsException("索引下标越界"+index);
        }
        if(size == elementData.length){
            elementData = grow();
        }
        System.arraycopy(elementData,index ,elementData,index+1,size-index);
        elementData[index] = obj;
        size++;
    }
    //向集合中添加数据
    public void add(Object obj, Object[] elementData, int s) {
        if (s == elementData.length) {
            elementData = grow();
        }
        elementData[s] = obj;
        size = s + 1;
    }

    //扩容
    public Object[] grow() {
        return elementData = Arrays.copyOf(elementData, elementData.length + (elementData.length >> 1));
    }

    //获取对应索引的元素值。
    public Object get(int index) {
        if (index < elementData.length) {
            return elementData[index];
        } else {
            throw new IllegalArgumentException("索引长度异常");
        }
    }

    //清除集合中所有元素。
    public void clear() {
       /* int to = size;
        size = 0;*/
        for (int to = size, i = size = 0; i < to; i++) {
            elementData[i] = null;
        }
    }
    //删除索引位置数据,返回
    public Object remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("索引下标越界" + index);
        }
        Object obj = elementData[index];
        size--;
        if(size>index){
            System.arraycopy(elementData,index+1,elementData,index,size-index);
        }
        elementData[size] = null;
        return obj;
    }
}

package com.Ronak.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull(){
        return data.length == size;
    }

    public void resize(){
        int[] temp = new int[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        data[size] = 0;
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index,int value){
        data[index] = value;
    }

    public boolean contains(int value){
        for (int i = 0; i < size; i++) {
            if (data[i] == value){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i + 1);
        }
        System.out.println(list.get(10));
        list.set(2,345);
        System.out.println(list.remove());;
        if (list.contains(17)){
            System.out.println("Exist!");
        }
        System.out.println(list);
    }
}

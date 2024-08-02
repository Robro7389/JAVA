package com.Ronak.Generics;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T elem){
        if (isFull()){
            resize();
        }
        data[size++] = elem;
    }

    public boolean isFull(){
        return data.length == size;
    }

    public void resize(){
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data,0,temp,0,data.length);
        data = temp;
    }

    public T remove(){
        T removed = (T)(data[size--]);
        data[size] = null;
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public void set(int index,T value){
        data[index] = value;
    }

    public boolean contains(T value){
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
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        System.out.println(list.get(2));
        list.set(1,"Nine");
        System.out.println(list.size());
        if (list.contains("gr")){
            System.out.println("Exist!");
        }
        else {
            System.out.println("Not exist!");
        }
        System.out.println(list);
    }
}
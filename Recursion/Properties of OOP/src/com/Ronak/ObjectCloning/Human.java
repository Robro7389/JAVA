package com.Ronak.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,8};
    }
    
    //Shallow Copy
  //  public Object clone() throws CloneNotSupportedException{
   //     return super.clone();
   // }
    
    //Deep Copy
    public Object clone() throws CloneNotSupportedException{
        Human Twin = (Human)super.clone(); //This is actually shallow copy
        
        //Deep copy
        Twin.arr = new int[Twin.arr.length];
        for (int i = 0; i < Twin.arr.length; i++) {
            Twin.arr[i] = this.arr[i];
        }
        return Twin;
    }
    
}

package BinaryTrees.Practice;

public class AVLmainP {

    public static void main(String[] args) {

        int[] arr = {15,10,5,12,20,18,25,30,35,40,45,50,55,60,70};

        AVLP tree = new AVLP(arr);
        System.out.println(tree.height());
        System.out.println(tree.balanced());
    }
}

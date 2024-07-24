package BinaryTrees.Practice;

public class BSTmainP {
    public static void main(String[] args) {
        int[] arr = {15,10,5,12,20,18,25};
        BSTpractice tree = new BSTpractice(arr);
        tree.display();
        System.out.println(tree.balanced());
        tree.preOrder();
        tree.postOrder();
        tree.inOrder();
    }
}

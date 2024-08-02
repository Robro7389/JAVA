package BinaryTrees;

public class BSTmain {
    public static void main(String[] args) {
        MyBST tree = new MyBST();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums);
        tree.display();
        System.out.println(tree.balanced());
        System.out.println(tree.height());



    }
}

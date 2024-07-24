package BinaryTrees;

public class MySTmain {
    public static void main(String[] args) {
        MySegmentTree tree = new MySegmentTree();
        int[] nums = {0,1,2,3,4,5,6,7};
        tree.insert(nums);
//        tree.display(nums);
        tree.update(nums,3,14);
        tree.display(nums);

    }
}

package BinaryTrees;

public class STmain {
    public static void main(String[] args) {

        int[] arr = {3,5,4,9,6};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        System.out.println(tree.query(1,3));
        tree.update(2, 10);
        System.out.println();
        tree.display();
    }
}

package BinaryTrees.Practice;

public class STmainP {
    public static void main(String[] args) {
        int[] arr = {3,5,9,6,4};
        STP tree = new STP(arr);
        tree.display();

        System.out.println();
        System.out.println(tree.query(1, 3));

        tree.update(2, 10);
        System.out.println();
        tree.display();
    }
}

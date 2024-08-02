package BinaryTrees;
import java.util.*;

public class BTmain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.generate(new Scanner(System.in));
        tree.prettyDisplay();

    }
}

package BinaryTrees.Practice;

import java.util.Scanner;

public class BTmainP {
    public static void main(String[] args) {
        BinaryTreeP tree = new BinaryTreeP();
        tree.generate(new Scanner(System.in));
        tree.display();
    }
}

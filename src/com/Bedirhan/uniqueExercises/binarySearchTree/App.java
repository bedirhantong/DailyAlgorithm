package com.Bedirhan.uniqueExercises.binarySearchTree;

public class App{
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.inorder();
        System.out.println();
        bst.preorder();
        System.out.println();
        bst.postorder();
        System.out.println();

    }
}

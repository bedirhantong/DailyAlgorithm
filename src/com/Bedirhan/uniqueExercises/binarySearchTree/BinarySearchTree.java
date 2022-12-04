package com.Bedirhan.uniqueExercises.binarySearchTree;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }


    public void inorder() {
        inorder(root);
    }
    public void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void preorder() {
        preorder(root);
    }
    public void preorder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder() {
        postorder(root);
    }
    public void postorder(Node root) {
        if(root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }




}
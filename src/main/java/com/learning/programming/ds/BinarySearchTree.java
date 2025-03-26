package com.learning.programming.ds;

public class BinarySearchTree<T> implements BinaryTreeInterface<T> {
    private Node<T> node;

    @Override public boolean add(T data) {
        return false;
    }

    @Override public void print() {

    }

    @Override public boolean search(T data) {
        return false;
    }

    class Node<T> {
        private Node<T> left;
        private Node<T> right;
        private T       data;
    }

}

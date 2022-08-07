package com.bridgelabz.datastructure;

public class Node<K,V>{

    K key;
    V value;
    Node<K,V> next;
    public Node(K key, V value) {
        this.key=key;
        this.value=value;
    }


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }



    public Node<K,V> getNext() {
        return next;
    }



    public void setNext(Node<K,V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +" Value="+value+
                '}';
    }


}

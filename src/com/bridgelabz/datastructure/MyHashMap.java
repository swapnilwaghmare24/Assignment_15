package com.bridgelabz.datastructure;

public class MyHashMap<K,V> {
    MyLinkedList<K,V> myLinkedList;

    public MyHashMap() {
        myLinkedList = new MyLinkedList<>();
    }

    public void add(K key, V value) {
        Node<K,V> itemNode = myLinkedList.search(key);
        if(itemNode == null) {
            itemNode = new Node<K, V>(key, value);
            myLinkedList.addLast(itemNode);
        } else {
            ((Node<K, V>)itemNode).setValue(value);
        }

    }

    public void print() {
        myLinkedList.printData();
    }

    public V get(K key) {
        Node<K,V> itemNode = myLinkedList.search(key);
        return itemNode != null ? itemNode.getValue() : null;
    }

    public int size()
    {
        return myLinkedList.size();
    }
    public void remove(K key) {
        Node<K,V> itemNode =  myLinkedList.search(key);
        if (itemNode != null) {
            myLinkedList.remove(itemNode);
        }
    }
}

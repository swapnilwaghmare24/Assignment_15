package com.bridgelabz.datastructure;

public class MyHashTable<K,V> {
    int bucketSize;
    MyHashMap<K, V>[] hashMaps;

    public MyHashTable(int bucketSize) {
        this.bucketSize = bucketSize;
        hashMaps = new MyHashMap[bucketSize];
        for (int i = 0; i < hashMaps.length; i++) {
            hashMaps[i] = new MyHashMap<>();
        }
    }

    public void print() {
        for (int i = 0; i < hashMaps.length; i++) {
            System.out.print("bucketIndex " + i + " : ");
            hashMaps[i].print();
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < hashMaps.length; i++) {
            size += hashMaps[i].size();
        }
        return size;
    }

    public void add(K key, V value) {
        int bucketIndex = Math.abs(key.hashCode() % bucketSize);
        hashMaps[bucketIndex].add(key, value);
    }

    public V get(K key) {
        int bucketIndex = Math.abs(key.hashCode() % bucketSize);
        V result = hashMaps[bucketIndex].get(key);
        return result;
    }

    public void remove(K key) {
        int bucketIndex = Math.abs(key.hashCode() % bucketSize);
        hashMaps[bucketIndex].remove(key);
    }
}

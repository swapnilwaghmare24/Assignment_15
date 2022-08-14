package com.bridgelabz.datastructure;

public class HashTableTest {

    public static void main(String[] args) {

        MyHashTable<String, Integer> hashTable = new MyHashTable<>(10);

        String phrase = "Paranoids are not paranoid because they are "
                + "paranoid but because they keep putting themselves "
                + "deliberately into paranoid avoidable situations";

        String[] words = phrase.split(" ");

        for (String w : words) {
            Integer prevValue = hashTable.get(w.toLowerCase());
            if (prevValue != null) {
                hashTable.add(w.toLowerCase(), prevValue + 1);
            } else {
                hashTable.add(w.toLowerCase(), 1);
            }
        }

        hashTable.print();
    }
}

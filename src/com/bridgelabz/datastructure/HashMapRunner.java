package com.bridgelabz.datastructure;

public class HashMapRunner {
    public static void main(String[] args) {


        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String phrase = "To be or not to be";

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            Integer prevValue = myHashMap.get(words[i].toLowerCase());
            if (prevValue != null) {
                myHashMap.add(words[i].toLowerCase(), prevValue + 1);
            } else {
                myHashMap.add(words[i].toLowerCase(), 1);
            }
        }

        myHashMap.print();
    }
}


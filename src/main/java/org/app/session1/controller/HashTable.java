package org.app.session1.controller;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Hashtable;

public class HashTable {

    public void main() {
    }

    public static class SimpleDictionary {
        private final Hashtable<String, String> dictionary;

        public SimpleDictionary() {
            dictionary = new Hashtable<>();
        }

        public void addWord(String word, String meaning) {
            dictionary.put(word, meaning);
        }

        public String getMeaning(String word) {
            return dictionary.get(word);
        }

        public void removeWord(String word) {
            dictionary.remove(word);
        }

        public String containsWord(String word) {
            return dictionary.containsKey(word) ? "Found: " + word : "Not Found";
        }

        public int size() {
            return dictionary.size();
        }
    }
}

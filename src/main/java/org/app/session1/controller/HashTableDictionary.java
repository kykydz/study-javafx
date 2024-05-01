package org.app.session1.controller;

import java.util.Hashtable;

public class HashTableDictionary {

//    public boolean searchWordFromCLI() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter word to search: ");
//        String word = scanner.nextLine();
//        scanner.close();
//        return dictionary.containsKey(word);
//    }
//
//    public static void main(String[] args) {
//        SimpleDictionary dictionary = new SimpleDictionary();
//        dictionary.addWord("hello", "a greeting");
//        dictionary.addWord("world", "the planet earth");
//
//        if (dictionary.searchWordFromCLI()) {
//            System.out.println("Word found in the dictionary.");
//        } else {
//            System.out.println("Word not found in the dictionary.");
//        }
//    }

    private void defaultContent(String[] args) {
        SimpleDictionary simpleDictionary = new SimpleDictionary();
        simpleDictionary.addWord("ONE", "SATU");
        simpleDictionary.addWord("TWO", "DUA");
        simpleDictionary.addWord("THREE", "TIGA");
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

        public String containsWord(String word) {
            return dictionary.containsKey(word) ?
                    "Found: " + word + " Meaning: " + getMeaning(word) :
                    "Not Found";
        }
    }
}



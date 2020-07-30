/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * This program reads in a text file, parses words, keeps track of how many 
     * times a word appears in the file, and then prints out the counts
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader in = null;
        try {
            HashMap<String, Integer> wordCount = new HashMap();
            in = new FileReader("text.txt");
            String word = "";
            int ch;
            while ((ch = in.read()) != -1) {
                if (Character.isLetter(ch)) {
                    word += (char)ch;
                }
                else {
                    if (word.length() > 0) {
                        word = word.toLowerCase();
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        }
                        else {
                            wordCount.put(word, 1);
                        }
                        word = "";
                    }
                }
            }
            in.close();

            Map<String, Integer> sortedWordCount = sortByValue((Map)wordCount);
            
            for (String key : sortedWordCount.keySet())
            {
                System.out.println(key + " - " + wordCount.get(key));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (in != null) {
                try { in.close(); } catch (IOException ex) {}
            }
        }
    }    

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                  .collect(Collectors.toMap(
                        Map.Entry::getKey, 
                        Map.Entry::getValue, 
                        (e1, e2) -> e1, 
                        LinkedHashMap::new
                      ));
    }
}

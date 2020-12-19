/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author javicodx
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
     public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);

    }

    public String translate(String word) {
        String tmp = this.dictionary.get(word);
        if (tmp == null) {

            tmp = dictionary.entrySet().stream().filter(entry -> entry.getValue().equals(word)).findAny().map(entry -> entry.getKey()).orElse(null);

        }
        return tmp;

    }

    public void delete(String word) {
        if (dictionary.remove(word) == null) {
            dictionary.values().removeIf(x -> x.contains(word));
        }
    }

    public boolean load() {
        try {
            //alternativa
            //Files.lines(Paths.get(this.file)).map(l -> l.split(":")).forEach(parts -> this.dictionary.put(parts[0], parts[1]));

            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            List<String> allreadySaved = new ArrayList<>();

            dictionary.keySet().stream().forEach(key -> {
                if (allreadySaved.contains(key)) {
                    return;
                }
                writer.println(key + ":" + dictionary.get(key));

                allreadySaved.add(key);
                allreadySaved.add(dictionary.get(key));
            });

            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }

    public void print() {
        dictionary.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

}

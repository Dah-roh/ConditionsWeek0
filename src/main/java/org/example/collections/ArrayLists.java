package org.example.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        System.out.println(stringList.isEmpty());
        stringList.add("Daro");
        stringList.add("Hydra");
        System.out.println(stringList.indexOf("Hydra"));
        stringList.remove("Daro");
        System.out.println(stringList.size());
        System.out.println(stringList.contains("Hydra"));
        stringList.set(0, "Daro");
        System.out.println(stringList);
        stringList.addAll(Arrays.asList("Hydra", "Futurama", "Family Guy", "Rick and Morty"));
//                        lambda expression
        stringList.forEach(words -> System.out.println(words));
        String[] stringArray = {"hydra", "Daro", "rick and morty", "family guy"};
        System.out.println();
        for (String words: stringArray){
            System.out.println(words);
        }
        //    lambda expression is an implementation of a functional interface
        stringList.forEach(words-> {
                    if (words.length()>5) {
                        System.out.println(words);
                    }
                }
        );
    }
}

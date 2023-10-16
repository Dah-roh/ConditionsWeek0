package org.example;

import org.example.entities.User;

import java.util.ArrayList;
import java.util.List;

public class StartUp {
    public static void main(String[] args) {
//       User adamu = new User();
//        adamu.userCourseAndMedia();

        String[][] arrayOfWords = {new String[]{"HUMAN", "CAT", "DOG", "METACOGNITION", "MULTI-DIMENSIONAL", "XYZ"}, {"DEPARTMENT", "JUDICIARY", "LEGISLATIVE"}};

        System.out.println("LENGTH OF ARRAY : "+arrayOfWords.length);
        for (int i = 0; i < arrayOfWords.length; i++) {
            for (int j = 0; j < arrayOfWords[i].length; j++) {
                System.out.println("Array Index: "+ i +" Array Element: "+ arrayOfWords[i][j]);
            }
        }

        int[] numbers = {1, 3, 5, 8, 5, 6, 7, 3};
        List<Integer> duplicateArray = new ArrayList<>();
        boolean isDuplicated  = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.println("Current number: "+numbers[i] + " ---- Checking number: "+numbers[j]);
                if (numbers[i]==numbers[j]){
                    duplicateArray.add(numbers[i]);
                    isDuplicated = true;
                }
            }

        }
        System.out.println("DUPLICATED: "+isDuplicated + " DUPLICATE(S) : "+duplicateArray);

        }
//        int age = 35;
//
//        boolean condition = age < 13;
//        boolean condition2 = age > 18;
//        String adultContent = condition?"Turn off adult content":(condition2?"MA allow mature audiences":"Watch to your heart's content!");
//
//        System.out.println(adultContent);
////        String adultContent;
//        if (condition){
//            adultContent = "Turn off adult content";
//            System.out.println(adultContent);
//        } else if (condition2) {
//            adultContent = "MA allow mature audiences";
//            System.out.println(adultContent);
//        } else {
//            adultContent = "Watch to your heart's content!";
//            System.out.println(adultContent);
//        }
    }
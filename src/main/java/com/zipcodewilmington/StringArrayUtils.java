package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {




    public static String getFirstElement(String[] array) {
        return array[0];
    }

    public static String getSecondElement(String[] array) {
        return array[1];
    }

    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    public static boolean contains(String[] array, String value) {
        for(String isIn: array) {
            if(value.equals(isIn)) return true;
        }
        return false;
    }



    public static String[] reverse(String[] array){
        for(int i = 0; i<(array.length/2); i++){
            String holder = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = holder;
        }
        return array;
    }


    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i <= array.length/2; i++){
            if(array[i].equals(array[array.length-1-i])){
                return true;
            }
        }
        return false;
    }


    public static boolean isPangramic(String[] array) {
        String id = "";
        for(String item: array){
            id += item.toLowerCase();
        }
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(id.indexOf(ch)<0) {
                return false;
            }
        }
        return true;
    }


    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(String item: array) {
            if(value.equals(item)) counter++;
        }
        return counter;
    }


    public static String[] removeValue(String[] array, String valueToRemove) {
        int value = getNumberOfOccurrences(array, valueToRemove);
        String[] removed = new String[array.length-value];
        int count = 0;
        for(String item: array){
            if(!item.equals(valueToRemove)){
                removed[count]= item;
                count++;
            }
        }
        return removed;
    }



    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] removeDup = new String[array.length];
        int count = 0;
        for(int i = 1; i<array.length; i++) {
            if (!array[i - 1].equalsIgnoreCase(array[i])) {
                removeDup[count] = array[i - 1];
                count++;
            }
        }
        removeDup[count] = array[array.length-1];
        count++;
        return Arrays.copyOf(removeDup,count);
    }


    public static String[] packConsecutiveDuplicates(String[] array) {
       StringBuilder pack = new StringBuilder();
       for(int i = 1; i<array.length; i++) {
           if(array[i].equals(array[i-1])) {
               pack.append(array[i-1]);
           } else {
               pack.append(array[i-1] + "/");
           }
       }
       pack.append(array[array.length-1]);
       return pack.toString().split("/");

    }



}

package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String i : array){
            if (i.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> s = new ArrayList<>();

        for (int i = array.length -1; i >= 0; i--){
            s.add(array[i]);
        }
        String[] answer = s.toArray(new String[0]);

        return answer;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> t = new ArrayList<>();

        for (int i = array.length -1; i >= 0; i--){
            t.add(array[i]);
        }
        String[] answer = t.toArray(new String[0]);

        return Arrays.equals(array, answer) ;


    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String lower = "";
        for (String s : array){
            lower += s.toLowerCase();
        }

        StringBuilder alphabet = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++){
                if (!lower.contains(  "" + i )){
                    return false;
                }
        }
        return true;



    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String s : array){
            if (s == value){
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String arrayValues = "";
        for (int i = 0; i <= array.length -1; i++){
            if(!(array[i].equals(valueToRemove))){
                arrayValues += array[i] + ",";
        }
        }
        String[] answer = arrayValues.split(",");
        return answer;
    }

        /*ArrayList<String> stringsArrayList = new ArrayList<>(Arrays.asList(array));

        stringsArrayList.remove(valueToRemove);
        String[] answer = new String[array.length -1];
        for (String s : stringsArrayList){
            answer[s] += (stringsArrayList.indexOf(s));
        }
        String[] answer = stringsArrayList.toArray();
        return answer;

    }*/

    /**
     * @param holdArray array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
            String holdArray = "x" + array + "x";
            String arrayValues = "";
            for (int i = 0; i <= array.length -3; i++){
                if(!(array[i].equals(array[i+1]))) {
                    arrayValues += array[i] + "/";
                }else if (array[i].equals(array[i + 1]) && !array[i].equals(array[i + 2]))
                         {
                    arrayValues += array[i] + array[i] + "/";
                }else {
                    arrayValues += array[i] + array[i] + array[i] + "/";
                }

            }
        String[] answer = arrayValues.split("/");
        return answer;
    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}


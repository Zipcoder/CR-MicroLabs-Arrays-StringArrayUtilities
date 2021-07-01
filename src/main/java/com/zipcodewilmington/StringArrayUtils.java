package com.zipcodewilmington;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

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
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // Ask about:
        // List<String> nameList = new ArrayList<>(Arrays.asList(array));
        // return nameList.contains(value);
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == value) {
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
        String[] reversedArr = new String[array.length];
        for(int i = 0; i < array.length; i++){
            reversedArr[i] = array[array.length - (i+1)];
        }
        return reversedArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] != array[array.length - (i+1)]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //Need a stringBuffer to hold all array strings together AND use .append
        StringBuffer oneString = new StringBuffer();
        for(String string: array){
            oneString.append(string);
        }
        //Turn stringBuffer into String
        String fullString = oneString.toString().toLowerCase();
        //Delete everything thats not a letter
        String lettersOnly = fullString.replaceAll("(.)(?=.*\\1)", "");
        //Delete all repeating letters
        String noRepeatChars = lettersOnly.replaceAll("[^a-z]", "");
        //Return true if string has 26 letters.
        return noRepeatChars.length() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String string: array) {
            if(string.equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int index = 0;
        for(String string: array){
            if(string != valueToRemove){
                array[index++] = string;
                //index++;
            }
        }
        String[] newArray = new String[index];
        for(int i = 0; i < index; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList();
        newArray.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i-1]){
                newArray.add(array[i]);
            }
        }
        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int countOfchars = 1;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                countOfchars++;
            }
        }
        String[] newArr = new String[countOfchars];
        int index = 0;
        String addMe = "";
        addMe += array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] == array[i-1]){
                addMe += array[i-1];
            } else if (array[i] != array[i-1]){
                newArr[index] = addMe;
                addMe = array[i];
                index++;
            }
        }
        newArr[index] = addMe;
        return newArr;
    }


}

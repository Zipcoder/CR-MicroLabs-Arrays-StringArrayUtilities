package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array){
        String firstWord = (array[0]);
        return firstWord;
    }



    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String secondWord = (array[1]);
        return secondWord;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int lastSpot = array.length-1;
        String lastWord = (array[lastSpot]);
        return lastWord;

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int secondLastSpot = array.length-2;
        String secondLastWord = (array[secondLastSpot]);
        return secondLastWord;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i <array.length; i++){
            if (array[i].equals(value)){
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
        String[] reverseArray = new String[array.length];
        int spotCount = 0;
        for (int i = array.length -1; i >= 0; i--){
            reverseArray[spotCount] = array[i];
            spotCount += 1;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String [] reverse = reverse(array);
        boolean result = Arrays.equals(reverse, array);
        if (result = true){
            return true;}
            return false;
        }














    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder originalArray = new StringBuilder();
    for (int i = 0; i < array.length; i++){
        originalArray.append(array[i]);
    }
for (char letter = 'a'; letter <= 'z'; letter++){
        if (originalArray.toString().toLowerCase().indexOf(letter)<0){ //if the letter is part of the index it will be <0
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
int numOccurences = 0;
for (int i = 0; i < array.length; i++){
    if (array[i].equals(value)){
        numOccurences++;
    }
}
return numOccurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}

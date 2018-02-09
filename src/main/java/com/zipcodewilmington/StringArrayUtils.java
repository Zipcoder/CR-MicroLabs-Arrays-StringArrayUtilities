package com.zipcodewilmington;

import java.util.ArrayList;

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
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean flick = false;
        for (String i : array ){
            if(i.equals(value)){
                flick = true;
            }
        }
        return flick;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] revArray = new String[array.length];
        for(int i = 0; i < array.length; i++){
            revArray[i]= array[array.length-i-1];
        }

        return revArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] revArray = reverse(array);
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i].equals(revArray[i]))) {
                result = false;
            }
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String combined = "";
        //convert to lowercase
        for (int i = 0; i < array.length; i++){
            combined += array[i].toLowerCase();
        }

        //checks if each letter is present
        for(char letter = 'a'; letter <= 'z'; letter++) {
            if (combined.indexOf(letter) == -1) {
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
        for (int j = 0; j < array.length; j++){
            if (array[j].contains(value)){
                counter++;
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
        int occurances = getNumberOfOccurrences(array, valueToRemove);

        String[] revisedArray = new String[array.length-occurances];
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if(!(array[i].equals(valueToRemove))){
                revisedArray[counter] = array[i];
                counter++;
            }
        }
        return revisedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> revArray = new ArrayList<String>();

        for (int i = 0; i < array.length-1; i++){
            if (array[i].equals(array[i+1])) {
                if ((array[i].equals(array[i + 1]) && i == array.length - 2)){
                    revArray.add(array[i]);
                    break;
                }
                continue;
            }
            else if (!(array[i].equals(array[i + 1]))) {
                revArray.add(array[i]);
                if (i == array.length - 2) {
                    revArray.add(array[i + 1]);
                }
            }

        }
        String[] strArray =  revArray.toArray(new String[revArray.size()]);
        return strArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> revArray = new ArrayList<String>();
        String placeHolderStr = "";
        for (int i = 0; i < array.length -1 ; i++){

            if (array[i].equals(array[i+1]) && !(i == array.length -2)) {
                placeHolderStr += array[i];
            }
            if (array[i].equals(array[i+1]) && (i == array.length -2)) {
                placeHolderStr += array[i];
                placeHolderStr += array[i+1];
                revArray.add(placeHolderStr);
                placeHolderStr = "";
            }
            else if (!(array[i].equals(array[i + 1])) || i == array.length -2) {
                placeHolderStr += array[i];
                revArray.add(placeHolderStr);
                placeHolderStr = "";
                if (!(array[i].equals(array[i + 1])) && i == array.length -2){
                    revArray.add(array[array.length-1]);
                }
            }

        }
        String[] strArray =  revArray.toArray(new String[revArray.size()]);
        return strArray;
    }


}

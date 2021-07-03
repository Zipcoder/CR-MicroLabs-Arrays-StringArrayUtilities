package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        ArrayList<String> arrayToList = new ArrayList<String>(Arrays.asList(array));
        if (arrayToList.contains(value)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = array.length - 1; i >= 0; i--) {
            arrayList.add(array[i]);
        }
        String[] backToArray = arrayList.toArray(new String[0]);
        return backToArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = array.length - 1; i >= 0; i--) {
            arrayList.add(array[i]);
        }
        String[] backToArray = arrayList.toArray(new String[0]);
        if (Arrays.equals(backToArray,array)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> arrayToList = new ArrayList<String>(Arrays.asList(array));
        String arrayToString = arrayToList.toString();
        arrayToString = arrayToString.replaceAll(",", "").replaceAll(" ","").toLowerCase();
        for (int i = 0; i < alphabet.length; i++) {
            if (!arrayToString.contains(alphabet[i])) {
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
        int occurrences = 0;
        for (String word : array) {
            if (word.equals(value)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayToList = new ArrayList<String>(Arrays.asList(array));
        arrayToList.remove(valueToRemove);
        String[] backToArray = new String[arrayToList.size()];
        backToArray = arrayToList.toArray(backToArray);
        return backToArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(array[0]);
        int indexForList = 0; // Have to create an index for the list b/c when it removes a dup, the size of the list doesn't increase
        for (int i = 1; i < array.length; i++) {
            if (!arrayList.get(indexForList).contains(array[i])) {
                arrayList.add(array[i]);
                indexForList++;
            }
        }
        return arrayList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(array[0]);
        int indexForList = 0; // Have to create an index for the list b/c when it concats a dup, the size of the list doesn't increase
        for (int i = 1; i < array.length; i++) {
            if (arrayList.get(indexForList).contains(array[i])) {
                arrayList.set(indexForList, (arrayList.get(indexForList) + array[i]));
            }
            else {
                arrayList.add(array[i]);
                indexForList++;
            }
        }
        return arrayList.toArray(new String[0]);
    }


}

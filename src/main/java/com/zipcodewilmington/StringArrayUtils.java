package com.zipcodewilmington;

import java.util.*;

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
        List <String> arrayList = new ArrayList<String>(Arrays.asList(array));
        return arrayList.contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] revArray = new String[array.length];
        int newArray = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            revArray[newArray] = array[i];
            newArray++;
        }
        return revArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] revArray = reverse(array);
        return Arrays.equals(revArray, array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String pangramic = Arrays.toString(array);
        pangramic = pangramic.toLowerCase(Locale.ROOT);
        if (pangramic.length() < 26) {
            return false;
        } else
                for (char i = 'a'; i <= 'z'; i++) {
                if (pangramic.indexOf(i) == -1)
                    return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        List <String> arrayList = new ArrayList<String>(Arrays.asList(array));
        return Collections.frequency(arrayList,value); //collections holds different methods I can use

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List <String> arrayList = new ArrayList<String>(Arrays.asList(array));
        while (arrayList.contains(valueToRemove)) {
            arrayList.remove(valueToRemove);
        }
        return arrayList.toArray(new String [0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
//        List <String> arrayList = new ArrayList<String>(Arrays.asList(array));
//
//        arrayList.add(array.(0));




//        String consecutive = Arrays.toString(array);
//        if (consecutive.length() <= 1)
//            return array;
//        if (consecutive.charAt(0) == consecutive.charAt(1))
//            return removeConsecutiveDuplicates(consecutive.substring(1));
//        else
//            return con
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

package com.zipcodewilmington;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        boolean checker = false;
        for (String arrayValue : array) {
            if (arrayValue == value) {
                checker = true;
                break;
            }
        }
        return checker;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int index = 0;
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            reverseArray[index++] = array[i];
       }
        return reverseArray;
      }
    // List<String> arrayList = Arrays.asList(array);
    // Collections.reverse(arrayList);
    // String[] reverseArrayList = arrayList.toArray(array);
    // return reverseArrayList;
    // }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[index++] = array[i];
        } if(!Arrays.equals(reverseArray, array)) {
            return false;
        } else { return true;}
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String stringArray = Arrays.toString(array);

        if(stringArray.toLowerCase().length() < 26) {
            return false;
        } else {
            for (char index = 'a'; index <= 'z'; index++) {
                if (stringArray.toLowerCase().indexOf(index) < 0) {
                    return false;
                }
            }
            return true;
        }

    }

//        List<String> arrayList = new ArrayList<String>();
//        String string = "";
//        for (String value: arrayList) {
//            if(!string.contains(value)) {
//                return false;
//            }
//        }
//        return true;
//    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int tracker = 0;
        for (int i = 0; i < array.length; i++) {
            if(value.equals(array[i])){
                tracker++;
            }
        }
        return tracker;
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

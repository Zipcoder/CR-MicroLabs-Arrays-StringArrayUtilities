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
        String result="";

          result = array[array.length-1];

        return result;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String result="";
        result=array[array.length-2];
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean result=false;
        for (String word : array) {
            if (word == value) {
                result = true;
            }
        }
        return result;
    }
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result= new String[array.length];
        int j = 0;
        for(int i=array.length-1;i>=0;i--){
            result[j]= array[i];
            j++;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
       Boolean result= true;
       for(int i=0;i<array.length;i++){
           if(!array[i].equals(array[array.length-i-1])) {
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
         Boolean result= true;
//
//        for (int i = 0; i < array.length; i++) {
//            if ('A' <= array.charAt(i) && array.charAt(i) <= 'Z') {
//                alphabetIndex = array.charAt(i) - 'A';
//                alphabetMarker[alphabetIndex] = true;
//            }
//        }
//        for (boolean index : alphabetMarker) {
//            if (!index) {
//                return false;
//            }
//        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for(int i = 0 ;i< array.length;i++)
        {
            if(array[i].equals(value))
            {
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
            ArrayList<String> tempArray = new ArrayList<String>();
        for(int i = 0;i<array.length;i++)
        {
            if(!array[i].equals(valueToRemove)) {
               tempArray.add(array[i]);

            }
        }
        String[] result = new String[tempArray.size()];
        result = tempArray.toArray(result);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        //ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> tempArrayList = new ArrayList<String>();
        for(int i = 0;i< array.length;i++) {
            tempArrayList.add(array[i]);
            //arrayList.add(array[i]);
            if(i>0) {
                if(array[i].equals(array[i - 1]))
                {
                    tempArrayList.remove(tempArrayList.size()-1);
                }
            }
        }
        String[] result= new String[tempArrayList.size()];
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}

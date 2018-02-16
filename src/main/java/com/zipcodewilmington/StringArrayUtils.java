package com.zipcodewilmington;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import javax.management.openmbean.ArrayType;
import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;

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
        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> targetList = Arrays.asList(array);
        Collections.reverse(targetList);
        String[] stringS = targetList.toArray(new String[targetList.size()]);
        return stringS;


        }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, reverse(array));

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
        String stringAsList = Arrays.toString(array);
        char[] ch = stringAsList.toCharArray();
        if(array == null || array.length < 26) {
            return false;
        }else if(ch.equals(alphabet)) {
            return true;
        }
        return false;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        List<String> list = new ArrayList<String>();
        for(String string : array){
            if(string.equals(value))count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, array);
        list.remove(valueToRemove);
        return list.toArray(new String[list.size()]);

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String junkFile = " ";
        String finalString = " ";
        LinkedList<String> newAL = new LinkedList<String>();

            for(String newSt : array) {
                if(!newSt.equals(finalString)){
                    finalString.concat(newSt);
                    finalString = newSt;
                    newAL.add(newSt);
                }else if(newSt.equals(finalString)){
                    junkFile.concat(newSt);
                    junkFile = newSt;
                }
            }
        return newAL.toArray(new String[newAL.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
            String previous = "";
            LinkedList<String> newL = new LinkedList<String>();
            for (String v: array){
                newL.add(v.equals( previous )? newL.pollLast() + v : v);
                previous = v;
            }
            return newL.toArray(new String[newL.size()]);
        }
    }




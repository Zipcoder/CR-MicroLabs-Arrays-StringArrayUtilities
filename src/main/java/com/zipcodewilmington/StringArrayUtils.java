package com.zipcodewilmington;

import java.lang.reflect.Array;
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
        //  System.out.println("First Element");
        return array[0];
    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        //  System.out.println("Second Element");
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        // System.out.println("Last Element");
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        // System.out.println("Second to Last");
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        //System.out.println("Boolean Array!");
        Boolean matchFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                matchFound = true;
            }
        }
        return matchFound;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        int newStringNum = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            reverse[newStringNum] = array[i];
            newStringNum++;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(reverse(array), array);
    }

    // calling reverse function from previous w a parameter of current array and compare to current array in this function

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // when putting in your own information use curly braces
        StringBuilder firstArraysString = new StringBuilder();
        // in order to make strings append you must use string builder
        for (int i = 0; i < array.length; i++) {
            firstArraysString.append(array[i]);
        }

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (firstArraysString.toString().toLowerCase().indexOf(letter) < 0) {
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
        int numOccur = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                numOccur++;
            }
        }
        return numOccur;

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList arrList = new ArrayList<Object>();
        for (int i = 0; i < array.length; i++) {
            if (arrList.equals(valueToRemove)) {
                arrList.remove(valueToRemove);

            }
        }
        return (String[]) arrList.toArray();
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<Integer> positionOfConsecutiveDuplicates = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                positionOfConsecutiveDuplicates.add(i);

            }
        }

        ArrayList<String> finalList = new ArrayList<String>(Arrays.asList(array));
        for (int i : positionOfConsecutiveDuplicates)
            finalList.remove(array[i]);

        return finalList.toArray(new String[finalList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> finalArrList = new ArrayList<String>();
        StringBuffer sameCharacters = new StringBuffer();

        for (int i = 0; i < array.length-1; i++) {

            String currentLetter = array[i];
            String nextLetter = array[i + 1];

            if (currentLetter.equals(nextLetter)) {
                sameCharacters.append(currentLetter);
            } else {
                sameCharacters.append(currentLetter);
                finalArrList.add(sameCharacters.toString());
                sameCharacters = new StringBuffer();
            }
        }

        String lastChararacter = array[array.length-1];
        String secondToLastChararacter = array[array.length-2];

        if (finalArrList.size() != 0){

            if(sameCharacters.length() == 0) {

                if (lastChararacter.equals(secondToLastChararacter)) {
                    String lastString = finalArrList.get(finalArrList.size() - 1);
                    String combinedString = lastString + lastChararacter;
                    finalArrList.add(finalArrList.size() - 1, combinedString);
                } else {
                    finalArrList.add(lastChararacter);
                }
            } else {
                sameCharacters.append(lastChararacter);
                finalArrList.add(sameCharacters.toString());
            }

        } else {
            sameCharacters.append(lastChararacter);
            finalArrList.add(sameCharacters.toString());
        }
        System.out.println(finalArrList);

        String[] stringArray = new String[finalArrList.size()];

        for(int i =0; i<finalArrList.size();i++){
            stringArray[i] = finalArrList.get(i);
        }


        return stringArray;
//        lol


    }
}

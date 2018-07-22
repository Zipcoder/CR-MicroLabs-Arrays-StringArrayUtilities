package com.zipcodewilmington;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

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
            String lastArray = array[array.length-1];
        return lastArray;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondtoLast = array[array.length-2];

        return secondtoLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean answer = false;

        for (int i = 0; i <array.length; i++){
            if (array[i].equals(value)) {
                answer = true;
            }
        }

        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String [] myReversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            myReversed[array.length - 1 - i] = array[i];
        }
        return myReversed;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean isPali= false;

        String[] checkReversed = reverse(array);

        /*for (int i =0; i > array.length; i--){

            checkReversed[array.length-1 -i] = array[i];

        }

        */
        if (Arrays.equals(array, checkReversed)) {

            isPali = true;

        }

        return isPali;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String checkSeen = "";
        boolean isPangram = false;

        for (int i = 0; i < array.length; i++) {
            checkSeen += array[i].toLowerCase();
        }

        for (char letter = 'a'; letter <= 'z'; letter++) {

            if (checkSeen.indexOf(letter) < 0) {
                isPangram = false;
            } else
                isPangram = true;

        }

        return isPangram;

    }
        /*

        HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();


        for (String word : sentence) {

            String lowerWord = word.toLowerCase();

            for (int i = 0; i < lowerWord.length(); i++) {
                Character letter = lowerWord.toCharArray()[i];
                System.out.println(letter);

                if (letterMap.containsKey(letter)) {
                    //then increment counter
                } else {
                    letterMap.put(letter, 1);
                }
            }

            System.out.println(letterMap);
            Set<Character> keySet = letterMap.keySet();
            System.out.println(keySet);
            System.out.println(keySet.size());

            return false;
        }
        return false;
    }

    */

    /**
     * @param array array of String objects
     * @param valueToCheck value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String valueToCheck) {

        int myCounter = 0;

        for (String currentIndex: array) {
            if (currentIndex.equals(valueToCheck)){
                myCounter++;
            }
        }

        return myCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        String stringToReturn = "";

        for (String currentIndex: array){
            if (!currentIndex.equals(valueToRemove)) {
                stringToReturn += currentIndex + " ";
            }
        }

        return stringToReturn.split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        //note: I referenced another dev's code while dev'ing this

        String my1stpartOftheAnswer = array[0] + "~";

        for (int i = 1; i <array.length; i++) {
            if (!array[i].equals(array[i-1])){
                my1stpartOftheAnswer += array[i] + "~";
            }
        }

        String[] answerArray = my1stpartOftheAnswer.split("~");

        return answerArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        //note: I referenced another dev's code while dev'ing this

        String dupString = array[0];

        for (int i = 1; i < array.length; i++){

            if (array[i].equals(array[i-1])) {
                dupString += array[i];
            } else {
                dupString += "~" + array[i];
            }
        }

        String[] answer = dupString.split("~");

        return answer;
    }

}

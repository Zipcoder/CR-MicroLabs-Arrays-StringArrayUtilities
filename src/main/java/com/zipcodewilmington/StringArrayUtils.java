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
    public static String getFirstElement(String[] array) { return array[0]; }


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
        boolean containValue = false;
        for(int i = 0; i < array.length; i++){
            if (array[i] == value) {
                containValue = true;
            }
        }
        return containValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int indexOfReversedArray = 0;
        for(int indexOfArray = 0; indexOfArray < array.length; indexOfArray++) { //filter through array
            reversedArray[indexOfReversedArray] = array[array.length - indexOfArray - 1]; //assigns reversedOrderArray at first position to array at last position
            indexOfReversedArray++; //increase for next index of ReversedArray
            }
        return reversedArray;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedOrderArr = reverse(array);
        return Arrays.equals(reversedOrderArr, array);
        /*for (int indexOfArray = 0; indexOfArray < reversedOrderArr.length; indexOfArray++) {
            String currentStringReversed = reversedOrderArr[indexOfArray];
            String currentStringForward = array[indexOfArray];
            if(!currentStringReversed.equals(currentStringForward)){
                return false;
            }
        }
        return true;*/
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String stringArray = Arrays.toString(array); //change array to string
        stringArray = stringArray.toLowerCase();

        if(stringArray.length() < 26 ){ //does the sentence have 26 characters? if less, does not contain every letter
            return false;
        } else {
            for (char letters = 'a'; letters <= 'z'; letters++) {
                if (stringArray.indexOf(letters) < 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfValueOccurrences = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                numOfValueOccurrences++;
            }
        }
        return numOfValueOccurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int removeCount = 0;
        int j = 0;
        String[] newArray = new String[(array.length - 1) - removeCount];
        for(int i = 0; i < array.length; i++){
            if (array[i] != valueToRemove) {
                newArray[j++] = array[i];
            }else removeCount++;

        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 0;
        String listOfSingles = "";
        String lastString = "";
        String[] newArray = new String[counter];

        for(String currentString : array){ //loop through array
            if(currentString == lastString){ //if current string is same as last string, assign to last string and continue
                lastString = currentString;
            } else if(currentString != lastString){ //if they are different..
                listOfSingles += currentString + " "; //add the current string to the list
                lastString = currentString; //assign to last string for comparison next loop
                counter++; //add to the counter
            }
       }
        newArray = listOfSingles.split(" ");
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add(array[0]); //input this array to newList
        int listIndex = 0; //index of newList

        for(int i = 1; i < array.length; i++){
            if(newList.get(listIndex).contains(array[i])) { //checks if the new list contains array[i] at its most recent index
                newList.set(listIndex, (newList.get(listIndex) + array[i])); //if yes, adds character to newList without increasing the index of newList AND groups duplicates together
            }else { //not consecutive
                listIndex++; //increase index of newList
                newList.add(array[i]); //add array[i] to newList
            }
        }
        return newList.toArray(new String[0]); //convert to array
    }

}

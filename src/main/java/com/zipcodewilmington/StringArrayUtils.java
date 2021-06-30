package com.zipcodewilmington;

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
        String arrayToString = array.toString();
        if (arrayToString.contains(value)) {
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
        String arrayAsString = "";
        for (int i = array.length; i >= 0; i--) {
            arrayAsString += (array[i] + " ");
        }
        String[] newArray = arrayAsString.split(" ");
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String arrayBackwards = "";
        for (int i = array.length; i >= 0; i--) {
            arrayBackwards += (array[i]);
        }
        String arrayFowards = array.toString().trim();
        if (arrayFowards.equals(arrayBackwards)) {
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
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String arrayAsString = array.toString();
        int amountOfLettersInAlphabet = 0;
        for (int i = 0; i < arrayAsString.length(); i++) {
            if (arrayAsString.contains(alphabet[i])) {
                amountOfLettersInAlphabet += 1;
            }
        }
        if (amountOfLettersInAlphabet == 26) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String arrayAsString = array.toString().trim();
        arrayAsString.replaceAll(value, " ");
        int index = 0;
        int numberOfOccurrences = 0;
        while ((index = arrayAsString.indexOf(" ", index)) != -1) {
            numberOfOccurrences += 1;
        }
        return numberOfOccurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String arrayAsString = array.toString();
        arrayAsString.replaceAll(valueToRemove, "");
        String[] backToArray = arrayAsString.split(",");
        return backToArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String arrayAsString = array.toString();
        String[] newArray;
        String stringWithNoDuplicates = "";
        for (int i = 0; i < array.length; i++) {
            if (arrayAsString.charAt(i) == arrayAsString.charAt(i + 1)) {
                stringWithNoDuplicates = arrayAsString.replaceFirst(String.format("%s", arrayAsString.charAt(i)), "");
            }
        }
        newArray = stringWithNoDuplicates.split(",");
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        
        return null;
    }


}

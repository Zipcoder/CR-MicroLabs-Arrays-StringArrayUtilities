package com.zipcodewilmington;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ //
    public static String getFirstElement(String[] array) {

        String firstElement = array[0];
        return firstElement;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String secondElement = array [1];
        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ //
    public static String getLastElement(String[] array) {
        String lastElement = array[array.length -1];
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ //
    public static String getSecondToLastElement(String[] array) {

        String secondToLast = array[array.length -2];
        return secondToLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) {

        boolean arrContains = false;
            for(String s: array) {
                if(s.equals(value))
                    arrContains = true;
            }
        return arrContains;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] newArray = new String[array.length];
            int reference = 0;
            for (int i = array.length -1; i >= 0; i--) {
                newArray[reference] = array[i];
                reference += 1;
            }
        return newArray;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {


        boolean originalEqualsReversed = true;

        String[] reversedArray =reverse(array);

        for (int i =0; i < array.length; i++) {
            if (reversedArray[i].equals(array[i])) {
                originalEqualsReversed = true;
            } else {
                originalEqualsReversed = false;
            }
        }


 /*
        int reference = 0;
        int halvedLength = (int)Math.floor((array.length)/2);

        String[] arrayPalindrome = new String[halvedLength];
        String[] arrayHalfOriginal = new String[halvedLength];

        for (int i = array.length; i<=(halvedLength); i--) {
            arrayPalindrome[reference] = array[i];
            reference += 1;
        }
       /* for (int i = 0; i <= halvedLength -1; i++) {
            arrayHalfOriginal[reference] = array[i];
            reference += 1;
        }

        if (arrayHalfOriginal.equals(arrayPalindrome)) {
            originalEqualsReversed = true;
        }
        return originalEqualsReversed;
        */


        return originalEqualsReversed;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder stringFromArray = new StringBuilder();
            for (int i =0; i < array.length; i++) {
                stringFromArray.append(array[i]);

            }
            for (char ch = 'a';  ch <= 'z'; ch++) {

                if (stringFromArray.toString().toLowerCase().indexOf(ch) < 0) {
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
        int count = 0;

        for (int i = 0; i < array.length; i++) {


            if (value.equals(array[i])) {
                count++;
            }

        }

        return count;

    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

            int countTrue = 0;
            int  countOccurences = getNumberOfOccurrences(array, valueToRemove);
            String[] arrayWithoutRemoved = new String[array.length - countOccurences];

            for (int p = 0; p < array.length; p++) {

                if (!array[p].equals(valueToRemove)) {
                    arrayWithoutRemoved[countTrue] = array[p];
                    countTrue++;
                }
            }
            return arrayWithoutRemoved;
    }




    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        StringBuilder cDRemoved = new StringBuilder();
        cDRemoved.append(array[0] + " ");
        String newString;
        for (int i = 1; i < array.length; i++) {

            if (!array[i].equals(array[i - 1])) {
                cDRemoved.append(array[i] + " ");

            }

        } newString = cDRemoved.toString();
        String[] newArray = newString.split(" ");
               return newArray;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder packagedString = new StringBuilder();
        StringBuilder sameChars= new StringBuilder();
        StringBuilder completelyPackagedStrings = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < array.length-1; i++) {

            String currChar = array[i];
            String nextChar = array[i + 1];

            if (isNextCharSame(currChar, nextChar)) {
                sameChars.append(currChar);
            } else {
                sameChars.append(currChar);
                arrayList.add(sameChars.toString());
                sameChars = new StringBuilder();

            }
        }

        String lastChar = array[array.length-1];
        String secondLastChar = array[array.length-2];

        if(lastChar.equals(secondLastChar)) {
            sameChars.append(lastChar);
            arrayList.add(sameChars.toString());
        } else {
            arrayList.add(lastChar);
        }
        System.out.println(arrayList);


        String[] finalList = new String[ arrayList.size() ];

        for(int i =0; i<arrayList.size(); i++){
            finalList[i] = arrayList.get(i);
        }

        return finalList;
    }

    public static boolean isNextCharSame(String currentChar , String nextChar) {
        if (currentChar.equals(nextChar) ){
            return true;
        } else {
            return false;
        }
    }



}

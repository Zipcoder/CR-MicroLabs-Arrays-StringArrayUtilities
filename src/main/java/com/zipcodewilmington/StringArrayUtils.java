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
        //used String value = array.name[i] to locate it and to return it I just put the value I created in return.
        String find = array[0];
        return find;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String locate = array[1];
        return locate;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String find1 = array[array.length-1];
        return find1;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        String find2 = array[array.length-2];
        return find2;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        /*the enhanced for loop starts at String myValue and searches to the end of array(so at every index comparing
        . Then we add an if statement to see if the beginning of myValue equals value (which is what we are looking
        for). */
        for (String myValue : array) {
            if(myValue.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] backwards = new String[array.length];
        int indexPositions = 0;

        for (int i = array.length-1; i >=0; i--){
            //print to a new array to hold the array values
            backwards[indexPositions] = array[i];
            indexPositions += 1;

        }
        return backwards;


    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        //the reverse method because we already made a program for reverse
        /*we don't have to change the placeholder "String [] arrays" in the method reverse we only need to change the
        name when we call the method*/
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //created a placeholder
        String letterHolder = " ";
        //created a for loop to go through the length of the array
        for(int i =0; i< array.length; i++){
            //now we are places the indexes from array and placing them into placeholder
            letterHolder += array[i];
        }
        //this loop goes through characters
        for (char ch = 'a'; ch <= 'z'; ch++){
            /*this is saying if the lower case letterholder value is less than zero than it cant be
             apart of the alphabet*/
            if(letterHolder.toLowerCase().indexOf(ch)<0){
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

        //created a countOccurence holder, to hold value everytime it appears

        int countOccurence = 0;

        for (String myValue : array) {
            if(myValue.equals(value))
                countOccurence++;
        }

        return countOccurence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        /*1.we create this 'newSize' to hold the size of the array
        2.now we have to create the array, with the new array size.
        3.created a placeholder for things that were not duplicates
        4.looping through the array
        5. if the array indexes are not equal to valueToRemove
        6. the next line basically swaps the array i for the other & we add to the counter
        7. printing the new results */
       int newSize = array.length - getNumberOfOccurrences(array, valueToRemove);
       String[] outputArray = new String[newSize];
       int indexNotDuplicates = 0;

        for (int i =0; i <array.length; i++){
            if(!array[i].equalsIgnoreCase(valueToRemove)){
                outputArray[indexNotDuplicates] = array[i];
                indexNotDuplicates++;
            }
        }
        return outputArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        //created an arraylist because i dont know the size my ending array will be
        ArrayList<String> counting = new ArrayList<String>();
        //this is to collect the first item, the other if statment wasn't printing it.
        if(array[0].equals(array[1])){
            counting.add(array[0]);
        }

        for (int i = 1; i<array.length; i++){
            /*katrice, remember [i -1] means its equal to index zero, so we are comparing index 1 to index 0 and
            everytime we go back through the for loop we add indexes and compare those*/
            if(!array[i].equals(array[i-1])){
                counting.add(array[i]);
            }
        }

        String[] duplicates = new String[counting.size()];
        duplicates = counting.toArray(duplicates);

        String str = Arrays.toString(duplicates);
        System.out.println(str);
        return duplicates;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;


    }


}

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
        for(int i=0;i<array.length;i++){
            if (array[i].equals(value)) {
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
        String[] reverseArray = new String[array.length];
        int j =0;
        for(int i=array.length-1;i>=0;i--){
            reverseArray[j]=array[i];
            j++;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int j = array.length-1;
        for(int i=0;i<array.length/2;i++){
            if(!(array[i].equals(array[j]))){
                return false;
            }
            j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
        }
        //String concatStr = builder.toString();
        System.out.println(builder.toString());
        for (char charCounter ='a'; charCounter <= 'z'; charCounter++) {
            if (builder.toString().toLowerCase().indexOf(charCounter) < 0) {
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
        int counter = 0;
        for(int i=0;i<array.length;i++){
            if(array[i].equalsIgnoreCase(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int counter =getNumberOfOccurrences(array, valueToRemove);
        String[] myArray = new String[array.length];
            for(int i=0;i<array.length;i++){
                    if(!(array[i].equals(valueToRemove)))
                    {
                        myArray[i]=array[i];

                    }
            }
            String[] resultArray = new String[array.length-counter];
            int resultArrayIndex=0;

            for(int k=0;k<myArray.length;k++){

                    if(myArray[k]!=null){
                        resultArray[resultArrayIndex]=myArray[k];
                        resultArrayIndex++;
                    }


            }

        return resultArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 0;
        String[] consecutiveDuplicatesRemoved = new String[array.length];
        for(int i=0;i<array.length-1;i++){
                if(!(array[i].equals(array[i+1]))){
                    consecutiveDuplicatesRemoved[i]=array[i];
                }else{
                    counter++;
                }
        }
        consecutiveDuplicatesRemoved[consecutiveDuplicatesRemoved.length-1]=array[array.length-1];
        System.out.println(counter);
        for (String s:consecutiveDuplicatesRemoved) {
        }
        String[] nonConsecutiveDuplicates = new String[array.length-counter];
        int nonConsecutiveDuplicatesIndex =0;
        for(int k=0;k<consecutiveDuplicatesRemoved.length;k++){
            if(consecutiveDuplicatesRemoved[k]!=null){
                nonConsecutiveDuplicates[nonConsecutiveDuplicatesIndex]=consecutiveDuplicatesRemoved[k];
                nonConsecutiveDuplicatesIndex++;
            }

        }
        return nonConsecutiveDuplicates;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String myString = "";
        for(int i =0;i<array.length;i++){
            myString+=array[i];
        }
        StringBuilder builder = new StringBuilder();
        builder.append(myString.charAt(0));
        for(int j=0;j<myString.length()-1;j++){
            if(myString.charAt(j)==myString.charAt(j+1)){
                builder.append(myString.charAt(j));
            }else{
                builder.append(",");
                builder.append(myString.charAt(j+1));
            }
        }
        return builder.toString().split(",");
    }


}

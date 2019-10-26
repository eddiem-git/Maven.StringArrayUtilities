package com.zipcodewilmington;

import java.util.ArrayList;
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
        int lastIndex = array.length - 1;
        return array[lastIndex];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int lastIndex = array.length - 2;
        return array[lastIndex];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;

        for (String i : array) {
            if (i == value) {
                result = true;
                break;
            }

        }
        return result;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    //given
    public static String[] reverse (String[]array){
        //get string arrays length
        String[] result = new String[array.length];
        //find last index of array
        int lastIndex = array.length - 1;
        //when currentIndex = lastIndex
        //NOW the currentIndex as long as the (currentIndex) is greater then 0
        //decrement down by 1
        for (int i = lastIndex; i >= 0; i--) {
            result[lastIndex - i] = array[i];
        }
        return result;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic (String[]array){

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(array[array.length - i - 1]))
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    //every number between 68 and 112 and every number is present
    public static boolean isPangramic (String[]array){
        String result ="";
        for(String str : array)
            result += str.toUpperCase();
        for(int i = 'A'; i <= 'Z'; i++){
            for (int j = 0; j < result.length(); j++){
                if(i == result.charAt(j)){
                    break;
                }else if (j == result.length() -1){
                    return false;
                }
            }
        }return true;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences (String[]array, String value){
        int counter = 0;
        for (int i = 0; i <= array.length - 1; i++)
        {
            if (array[i].equals(value))
            {
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
    public static String[] removeValue (String[]array, String valueToRemove) {
        String[] output = new String[array.length - 1];
        int count = 0;
        for (String removedString : array) {
            if (!removedString.equals(valueToRemove)) {
                output[count++] = removedString;
            }
        }
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> resultAsList = new ArrayList<>();

        int size = array.length;
        for (int i = 0; i <size-1; i++) {
            String currentElement = array[i];
            String nextElement = array[i+1];
            if(currentElement == nextElement) {
                resultAsList.add(currentElement);
                i++;
            }
        }
        return resultAsList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates (String[]array){
        List<String> resultAsList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String currentElement = array[i];
            String nextElement = array[i+1];

        }

        return resultAsList.toArray(new String[0]);
    }

}



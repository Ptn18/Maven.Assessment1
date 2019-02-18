package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for( int i =0; i <objectArray.length; i++)
            if(objectArray[i] == objectToCount){
                count++;
            }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //get the length of array by getting the number of occurance for objectToRemove
    int count = getNumberOfOccurrences(objectArray,objectToRemove);
    //the length of newArray is the length of array - count
    Object[] newArray = new Object[objectArray.length- count];
    //go trough loop
    int newArrayIndex = 0;
    for(int i = 0; i <objectArray.length;i++){
        //if objectToRemove is not equal to objectArray[i]
        if(!objectToRemove.equals(objectArray[i])){
            newArray[newArrayIndex] = objectArray[i];
            newArrayIndex++;

        }
    }
        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1, tempCount;
        Object mostOccurred = objectArray[0];
        Object temp = 0;
        for(int i = 0; i< objectArray.length-1; i++){
            temp = objectArray[i];
            tempCount = 0;
            for(int j= 1; j<objectArray.length;j++)
            {
                if(temp==objectArray[j])
                    tempCount++;
            }
            if(tempCount > count)
            {
                mostOccurred =temp;
                count= tempCount;
            }


        }
        return mostOccurred;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
//        List list = new ArrayList(Arrays.asList(objectArray));
//        list.addAll(Arrays.asList(objectArrayToAdd));
//        Object[] merged = list.toArray();
//        int mergedInt = (int)merged;

        return null;
    }
}

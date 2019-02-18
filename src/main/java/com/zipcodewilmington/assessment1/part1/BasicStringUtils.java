package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        return builder.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder builder =new StringBuilder(str);
        builder.reverse();
        String output = builder.substring(0, 1).toUpperCase() + builder.substring(1);

        return output;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String noLastChar = str.substring(1);
        String noFirstChar = noLastChar.substring(0,noLastChar.length()-1);
        return noFirstChar;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char [] charArray = str.toCharArray();
        for(int i=0; i < charArray.length; i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }else{
                if(Character.isLowerCase(charArray[i])){
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }
            str = new String(charArray);
        }
        return str;

    }
}

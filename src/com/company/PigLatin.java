package com.company;

/**
 * Move the first letter of each word to the end of it,
 * then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 */

public class PigLatin {
    public static String pigIt(String str) {
        String res="";
        String[] strings = str.split(" ");

        //main loop

        for(int x=0;x<strings.length;x++){
//ading changed word to an array
            strings[x] = strings[x]+strings[x].charAt(0)+"ay";
// errasing first letter of each word and replacing word
            StringBuilder stringBuilder = new StringBuilder(strings[x]);
            stringBuilder.deleteCharAt(0);
            strings[x] = stringBuilder.toString();

//checking if it is the last word in array

            if(x<strings.length-1)

//addin word to a sentence with blank spaces in between them

            res = res + strings[x]+" ";

//making last word not add blank space at the end

            else if(x<strings.length){
                res= res+strings[x];
            }}







    return res;
    }
}

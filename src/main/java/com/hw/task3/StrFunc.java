package com.hw.task3;

public class StrFunc {
    public static boolean Palindrom(String str){
        var len=str.length();
        for(int i=0,j=len-1;i<j;i++,j--)
            if(str.charAt(i)!=str.charAt(j)) return false;
        return true;
    }
//    public static Integer VowelCount(String str){}
//    public static Integer ConsonantCount(String str){}
//    public static Integer SubstringCount(String str){}
}

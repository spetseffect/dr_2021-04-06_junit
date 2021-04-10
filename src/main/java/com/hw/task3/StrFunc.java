package com.hw.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrFunc {
    public static boolean Palindrom(String str){
        var len=str.length();
        for(int i=0,j=len-1;i<j;i++,j--)
            if(str.charAt(i)!=str.charAt(j)) return false;
        return true;
    }
    public static Integer VowelCount(String str){
        int count=0;
        Pattern p=Pattern.compile("[аеёиоуыэюяaeiouy]",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(str);
        while (m.find()){
            count++;
        }
        return count;
    }
//    public static Integer ConsonantCount(String str){}
//    public static Integer SubstringCount(String str){}
}

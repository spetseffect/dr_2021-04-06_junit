package com.hw.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrFunc {
    private static Integer MatchesCounterCaseInsensitive(String str, String reg){
        int count=0;
        Pattern p=Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(str);
        while (m.find()){
            count++;
        }
        return count;
    }
    public static boolean Palindrom(String str){
        var len=str.length();
        for(int i=0,j=len-1;i<j;i++,j--)
            if(str.charAt(i)!=str.charAt(j)) return false;
        return true;
    }
    public static Integer VowelCount(String str){
        return MatchesCounterCaseInsensitive(str,"[аеёиоуыэюяaeiouy]{1}");
    }
    public static Integer ConsonantCount(String str){
        return MatchesCounterCaseInsensitive(str,"[бвгджзклмнпрстфхцчшщbcdfghjklmnpqrstvwxz]{1}");
    }
    public static Integer WordCount(String str,String word){
        return MatchesCounterCaseInsensitive(str,"\\b"+word+"\\b");
    }
}

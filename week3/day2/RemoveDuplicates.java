package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
        String text = "We learn java basics as part of java sessions in java week1";
        
        String word[]= text.split(" ");
        
        Set<String> word1= new LinkedHashSet<String>();
        for(int i=0;i<word.length;i++) {
            word1.add(word[i]);
        }
        System.out.println(word1);
    }

}

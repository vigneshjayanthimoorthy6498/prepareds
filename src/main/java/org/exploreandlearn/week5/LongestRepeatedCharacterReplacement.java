package org.exploreandlearn.week5;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatedCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int left =0, right = 0, res = 0, max = 0 ;
        Map<Character, Integer> map = new HashMap<>();
        for(; right < s.length(); right++) {
            int count = map.merge(s.charAt(right), 1, Integer::sum);
            max = Math.max(count, max);
            while((right -left + 1) - max > k) {
                map.merge(s.charAt(left), -1, Integer::sum);
                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
           res = Math.max(res, (right - left + 1));
        }
        return res;
    }

    public static void main(String[] args) {
        LongestRepeatedCharacterReplacement longestRepeatedCharacterReplacement = new LongestRepeatedCharacterReplacement();
        System.out.println(longestRepeatedCharacterReplacement.characterReplacement("ABAB", 2));
    }
}
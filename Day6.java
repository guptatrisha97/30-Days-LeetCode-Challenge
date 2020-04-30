/*Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]*/


import java.io.*;
import java.util.Arrays;
import java.util.Collections;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>() ;
        for (String current : strs) {
            char [] a = current.toCharArray() ;
            Arrays.sort(a) ;
            String sorted = new String(a) ;
            if (!map.containsKey(sorted)) {

                map.put( sorted , new ArrayList <> () ) ;
            }

            map.get( sorted ).add( current ) ;
        }

        return new ArrayList <> ( map. values ()) ;
    }

}

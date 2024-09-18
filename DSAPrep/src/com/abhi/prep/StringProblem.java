package com.abhi.prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



//import java.util.*;

public class StringProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        while (T-- > 0) {
            String s = br.readLine().trim();
            String[] result = getAllStrings(s);
            System.out.println(String.join(" ", result));
        }
    }
    
    public static String[] getAllStrings(String s) {
        List<String> results = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return new String[0];
        }
        decode(s, 0, new StringBuilder(), results);
        Collections.sort(results);
        return results.toArray(new String[0]);
    }
    
    private static void decode(String s, int index, StringBuilder current, List<String> results) {
        if (index == s.length()) {
            results.add(current.toString());
            return;
        }
        
        // Single digit decoding
        if (index < s.length()) {
            int num = s.charAt(index) - '0';
            if (num > 0) { // Only consider valid mappings (1-9)
                char c = (char) (num + 'a' - 1);
                current.append(c);
                decode(s, index + 1, current, results);
                current.deleteCharAt(current.length() - 1);
            }
        }
        
        // Double digit decoding
        if (index + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(index, index + 2));
            if (num >= 10 && num <= 26) { // Valid two-digit mappings (10-26)
                char c = (char) (num + 'a' - 1);
                current.append(c);
                decode(s, index + 2, current, results);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}

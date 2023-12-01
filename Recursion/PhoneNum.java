package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNum {
    static List<String> li = new ArrayList<>();
    static HashMap<Character, String> hm = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return li;
        }
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        permutation("", digits);
        return li;
    }

    public static void permutation(String p, String up) {

        if (up.isEmpty()) {
            li.add(p);
            return;
        }

        for (int i = 0; i < (hm.get(up.charAt(0))).length(); i++) {
            char ch = (hm.get(up.charAt(0))).charAt(i);
            permutation(p + ch, up.substring(1));
        }
    }
}

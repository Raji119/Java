import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L49GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            if (strs == null || strs.length == 0) {
                return new ArrayList<>();
            }

            Map<String, List<String>> frequency = new HashMap<>();

            for (String str : strs) {

                String freString = getFrequency(str);

                if (frequency.containsKey(freString)) {
                    frequency.get(freString).add(str);
                } else {
                    List<String> s = new ArrayList<>();
                    s.add(str);
                    frequency.put(freString, s);
                }
            }
            return new ArrayList<>(frequency.values());
        }

        public static String getFrequency(String s) {
            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder ans = new StringBuilder("");
            char ch = 'a';
            for (int i : freq) {
                if (i != 0) {
                    ans.append(ch);
                    ans.append(i);
                }
                ch++;
            }
            return ans.toString();
        }
    }
}

package LeetCode;

public class L2125NumberOfLaserBeamsInABank {

    public int numberOfBeams(String[] bank) {

        int ans = 0;

        int cur = 0, next = 0;

        for (int i = 0, k = i + 1; i < bank.length; i++, k = i + 1) {
            if (bank[i].contains("1")) {
                while (k < bank.length) {
                    if (bank[k].contains("1")) {
                        break;
                    }
                    k++;
                }
                for (int j = 0; j < bank[i].length(); j++) {
                    if (bank[i].charAt(j) == '1') {
                        cur++;
                    }

                    if (((k) < bank.length) && bank[k].charAt(j) == '1') {
                        next++;
                    }

                }
                ans += cur * next;
                cur = 0;
                next = 0;
            }

        }

        return ans;
    }
}
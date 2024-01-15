package LeetCode;

public class L91NumOfBits {
    public int hammingWeight(int n) {

        int bitCnt = 0;

        while (n != 0) {
            bitCnt++;
            n &= (n - 1);
        }

        return bitCnt;

    }
}

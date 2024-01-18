package LeetCode;

public class L70ClimbingSteps {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int f0 = 1, f1 = 2, sum = f0 + f1;
        for (int i = 3; i < n; i++) {
            f0 = f1;
            f1 = sum;
            sum = f0 + f1;
        }
        return sum;
    }
}

package LeetCode;

import java.util.HashSet;
import java.util.Set;

class L1496PathCrossing {
    public boolean isPathCrossing(String path) {

        Set<String> visitedPoints = new HashSet<>();
        int x = 0, y = 0;
        visitedPoints.add(x + "," + y);

        for (char ch : path.toCharArray()) {
            if (ch == 'N')
                y++;
            else if (ch == 'S')
                y--;
            else if (ch == 'E')
                x++;
            else
                x--;

            String point = x + "," + y;
            if (visitedPoints.contains(point)) {
                return true;
            }

            visitedPoints.add(point);
        }
        return false;

    }
}
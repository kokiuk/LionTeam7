package programmers;

import java.util.Arrays;

public class Solution2 {
    public int solution(int a, int d, boolean[] included) {

        int answer = 0;

        int[] result = new int[included.length];

        result[0] = a;

        for (int i = 1; i < included.length; i++) {
            result[i] = result[i -1] + d;
        }

        for (int i = 0; i < result.length; i++) {
            if (included[i]) answer += result[i];
        }
        return answer;
    }
}

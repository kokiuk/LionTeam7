package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> missingScore = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            missingScore.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (missingScore.get(photo[i][j]) != null){
                    score += missingScore.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }

        return answer;
    }
}

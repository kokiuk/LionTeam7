package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public List<String> solution(String[] names) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (i%5 == 0){
                answer.add(names[i]);
            }
        }
        return answer;
    }
}

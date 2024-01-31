package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution181894 {
    public List<Integer> solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();
        List<Integer> point = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                point.add(i);
            }
        }
        if (!point.isEmpty()){
            int min = Collections.min(point);
            int max = Collections.max(point);

            for (int i = min; i < max+1; i++) {
                answer.add(arr[i]);
            }
        }else{
            answer.add(-1);
        }

        return answer;
    }
}

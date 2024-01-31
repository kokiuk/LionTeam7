package programmers;

public class Solution181920 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int arrayPoint = 0;

        for (int i = start_num; i < end_num+1; i++) {
            answer[arrayPoint] = i;
            arrayPoint++;
        }

        return answer;
    }
}

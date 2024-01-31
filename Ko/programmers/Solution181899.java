package programmers;

public class Solution181899 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int turn = 0;

        for (int i = start; i >= end_num; i--) {
            answer[turn] = i;
            turn++;
        }

        return answer;
    }
}

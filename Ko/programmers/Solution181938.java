package programmers;

public class Solution181938 {
    public int solution(int a, int b) {
        String plus = String.valueOf(a) + String.valueOf(b);

        if (Integer.parseInt(plus) < 2*a*b){
            return 2*a*b;
        }else return Integer.parseInt(plus);
    }
}

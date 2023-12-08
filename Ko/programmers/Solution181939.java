package programmers;

public class Solution181939 {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        if (Integer.parseInt(strA+strB) < Integer.parseInt(strB+strA)){
            return Integer.parseInt(strB+strA);
        }else {
            return Integer.parseInt(strA+strB);
        }
    }
}

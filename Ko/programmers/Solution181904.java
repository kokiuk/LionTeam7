package programmers;

public class Solution181904 {
    public String solution(String my_string, int m, int c) {

        StringBuilder result = new StringBuilder();

        int start = c-1;
        while (start < my_string.length()){
            result.append(my_string.charAt(start));
            start += m;
        }

        return result.toString();

    }

}

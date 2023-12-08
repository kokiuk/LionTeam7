package programmers;

public class Solution181934 {
    public int solution(String ineq, String eq, int n, int m) {

        switch (ineq+eq){
            case ">=":
                if (n >= m){
                    return 1;
            }else {
                    return 0;
                }
            case "<=":
                if (n <= m){
                    return 1;
                }else {
                    return 0;
                }
            case ">!":
                if (n > m){
                    return 1;
                }else {
                    return 0;
                }
            case "<!":
                if (n<m){
                    return 1;
                }else {
                    return 0;
                }
        }
        return -1;
    }
}

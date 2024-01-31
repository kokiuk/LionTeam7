package programmers;

public class Solution181928 {
    public int solution(int[] num_list) {

        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i]%2 == 0){
                evenSb.append(num_list[i]);
            }else {
                oddSb.append(num_list[i]);
            }
        }

        return Integer.parseInt(oddSb.toString()) + Integer.parseInt(evenSb.toString());

    }
}

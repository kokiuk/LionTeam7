package programmers;

public class Solution15994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int card1Point = 0;
        int card2Point = 0;
        for (String s : goal) {

            if (card1Point < cards1.length && s.equals(cards1[card1Point])) {
                card1Point++;
            } else if (card2Point < cards2.length && s.equals(cards2[card2Point])) {
                card2Point++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
